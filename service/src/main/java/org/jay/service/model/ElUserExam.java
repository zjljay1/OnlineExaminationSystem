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
public class ElUserExam implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 考试ID
     */
    private String examId;

    /**
     * 考试次数
     */
    private Integer tryCount;

    /**
     * 最高分数
     */
    private Integer maxScore;

    /**
     * 是否通过
     */
    private Integer passed;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
