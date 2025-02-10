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
public List<EmbeddingItem> embeddingsRequest(){
    String azureOpenaiKey = "6VS8SKYPdi4ZGs3ltxYQNDdpMJEogk30g0L4N0ghqFdD0B8YWNHUJQQJ99BBACHYHv6XJ3w3AAAFACOGRYBw";
    String endpoint = "https://hacknet-colsanjose.openai.azure.com/";
    String deploymentOrModelId = "text-embedding-ada-002";

    OpenAIClient client = new OpenAIClientBuilder()
        .credential(new AzureKeyCredential(azureOpenaiKey))
        .endpoint(endpoint)
        .buildClient();

    EmbeddingsOptions embeddingsOptions = new EmbeddingsOptions(Arrays.asList("Zelaya cv"));

    Embeddings embeddings = client.getEmbeddings(deploymentOrModelId, embeddingsOptions);

    return embeddings.getData();
}
}
