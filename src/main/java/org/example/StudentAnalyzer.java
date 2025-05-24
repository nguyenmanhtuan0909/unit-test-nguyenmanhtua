package org.example;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Đếm số học sinh đạt loại Giỏi (điểm >= 8.0)
     * Bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (double score : scores) {
            if (score >= 0 && score <= 10 && score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình các điểm hợp lệ (0 <= điểm <= 10)
     * Trả về 0 nếu không có điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        double total = 0;
        int count = 0;
        for (double score : scores) {
            if (score >= 0 && score <= 10) {
                total += score;
                count++;
            }
        }

        return (count > 0) ? total / count : 0;
    }
}

