package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 试题题库关联
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElQuRepo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 试题
     */
    private String quId;

    /**
     * 归属题库
     */
    private String repoId;

    /**
     * 题目类型
     */
    private Integer quType;

    /**
     * 排序
     */
    private Integer sort;


}
