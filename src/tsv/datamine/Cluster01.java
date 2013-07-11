/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsv.datamine;

import java.io.File;

import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;

/**
 *
 * @author cs8170
 */
public class Cluster01 {

    private static final String DATASET = "/export/Development/DataMining/apples.csv";

    public static void main(String[] args) throws Exception {
        /* Load a dataset */
        Dataset data = FileHandler.loadDataset(new File(DATASET), 3, ",");
        /* Create a new instance of the KMeans algorithm, with no options
         * specified. By default this will generate 4 clusters. */
        Clusterer km = new KMeans();
        /* Cluster the data, it will be returned as an array of data sets, with
         * each dataset representing a cluster. */
        Dataset[] clusters = km.cluster(data);
        for (int i = 0; i < clusters.length; i++) {
            Dataset dataset = clusters[i];
            System.out.println(i + " " + dataset.toString());
        }
    }
}
