package com.logicbuilding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransposeMatrix {

    private static final Logger log =
            LoggerFactory.getLogger(TransposeMatrix.class);
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        log.info("Original Matrix:");

        for (int[] row : matrix) {
            StringBuilder sb = new StringBuilder();

            for (int value : row) {
                sb.append(value).append(" ");
            }

            log.info(sb.toString().trim());
        }

        int[][] transpose =
                new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                transpose[col][row] = matrix[row][col];
            }
        }

        log.info("Transposed Matrix:");

        for (int[] row : transpose) {
            StringBuilder sb = new StringBuilder();

            for (int value : row) {
                sb.append(value).append(" ");
            }

            log.info(sb.toString().trim());
        }
    }
}
