package org.example.BackEnd.Embeddings;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.EmbeddingItem;
import com.azure.ai.openai.models.Embeddings;
import com.azure.ai.openai.models.EmbeddingsOptions;
import com.azure.ai.openai.models.EmbeddingsUsage;
import com.azure.core.credential.AzureKeyCredential;


import java.util.*;
public class EmbeddingsRequests {
public String embeddingsRequest(String embRequest){
    String azureOpenaiKey = "DbJJJ2a7jiUDtSZo4aFulZzZX2W3TPQNQvJW2gKHVL0ciZhdXyJiJQQJ99BAACHYHv6XJ3w3AAABACOGh5pr";
    String endpoint = "https://hacknet-colsanjose.openai.azure.com/";
    String deploymentOrModelId = "text-embedding-ada-002";

    OpenAIClient client = new OpenAIClientBuilder()
        .credential(new AzureKeyCredential(azureOpenaiKey))
        .endpoint(endpoint)
        .buildClient();

    EmbeddingsOptions embeddingsOptions = new EmbeddingsOptions(Arrays.asList(embRequest));

    Embeddings embeddings = client.getEmbeddings(deploymentOrModelId, embeddingsOptions);
    //"'[12.12,14.14]'"
    String emb = "'[";
    for(EmbeddingItem item: embeddings.getData()){
            for(Float embedding : item.getEmbedding()){
                emb = emb+embedding.toString()+",";
                
            }
            emb=emb.substring(0, emb.length()-1);
            emb = emb+"]'";
    }

    System.out.println(emb);
    return emb;
}
}
