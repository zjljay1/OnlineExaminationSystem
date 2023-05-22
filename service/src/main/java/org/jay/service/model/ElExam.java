package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试主表
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElExam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 考试名称
     */
    private String title;

    /**
     * 考试描述
     */
    private String content;

    /**
     * 1公开2部门3定员
     */
    private Integer openType;

    /**
     * 考试状态
     */
    private Integer state;

    /**
     * 是否限时
     */
    private Integer timeLimit;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 总分数
     */
    private Integer totalScore;

    /**
     * 总时长（分钟）
     */
    private Integer totalTime;

    /**
     * 及格分数
     */
    private Integer qualifyScore;


}
