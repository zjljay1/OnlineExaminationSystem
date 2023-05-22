package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试题库
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElExamRepo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 考试ID
     */
    private String examId;

    /**
     * 题库ID
     */
    private String repoId;

    /**
     * 单选题数量
     */
    private Integer radioCount;

    /**
     * 单选题分数
     */
    private Integer radioScore;

    /**
     * 多选题数量
     */
    private Integer multiCount;

    /**
     * 多选题分数
     */
    private Integer multiScore;

    /**
     * 判断题数量
     */
    private Integer judgeCount;

    /**
     * 判断题分数
     */
    private Integer judgeScore;

    /**
     * 简答题数量
     */
    private Integer saqCount;

    /**
     * 简答题分数
     */
    private Integer saqScore;


}
