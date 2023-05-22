package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试记录考题
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElPaperQu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 试卷ID
     */
    private String paperId;

    /**
     * 题目ID
     */
    private String quId;

    /**
     * 题目类型
     */
    private Integer quType;

    /**
     * 是否已答
     */
    private Integer answered;

    /**
     * 主观答案
     */
    private String answer;

    /**
     * 问题排序
     */
    private Integer sort;

    /**
     * 单题分分值
     */
    private Integer score;

    /**
     * 实际得分(主观题)
     */
    private Integer actualScore;

    /**
     * 是否答对
     */
    private Integer isRight;


}
