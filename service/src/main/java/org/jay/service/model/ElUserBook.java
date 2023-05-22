package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 错题本
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElUserBook implements Serializable {

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
     * 用户ID
     */
    private String userId;

    /**
     * 题目ID
     */
    private String quId;

    /**
     * 加入时间
     */
    private Date createTime;

    /**
     * 最近错误时间
     */
    private Date updateTime;

    /**
     * 错误时间
     */
    private Integer wrongCount;

    /**
     * 题目标题
     */
    private String title;

    /**
     * 错题序号
     */
    private Integer sort;


}
