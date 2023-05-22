package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试记录答案
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElPaperQuAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 试卷ID
     */
    private String paperId;

    /**
     * 回答项ID
     */
    private String answerId;

    /**
     * 题目ID
     */
    private String quId;

    /**
     * 是否正确项
     */
    private Integer isRight;

    /**
     * 是否选中
     */
    private Integer checked;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 选项标签
     */
    private String abc;


}
