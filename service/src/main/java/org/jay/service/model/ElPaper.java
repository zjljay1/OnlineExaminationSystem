package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试记录
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElPaper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试卷ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 部门ID
     */
    private String departId;

    /**
     * 规则ID
     */
    private String examId;

    /**
     * 考试标题
     */
    private String title;

    /**
     * 考试时长
     */
    private Integer totalTime;

    /**
     * 用户时长
     */
    private Integer userTime;

    /**
     * 试卷总分
     */
    private Integer totalScore;

    /**
     * 及格分
     */
    private Integer qualifyScore;

    /**
     * 客观分
     */
    private Integer objScore;

    /**
     * 主观分
     */
    private Integer subjScore;

    /**
     * 用户得分
     */
    private Integer userScore;

    /**
     * 是否包含简答题
     */
    private Integer hasSaq;

    /**
     * 试卷状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 截止时间
     */
    private Date limitTime;


}
