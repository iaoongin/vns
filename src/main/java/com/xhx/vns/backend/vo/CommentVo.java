package com.xhx.vns.backend.vo;

import com.xhx.vns.backend.pojo.Comment;
import lombok.Data;

import java.util.Date;

/**
 * @author XHX
 * @date 2018/4/24.
 */
@Data
public class CommentVo{

    private Long commentArchitectureId;
    private Long commentAuthor;
    private Long commentTarget;
    private Date commentDate;
    private Date commentDateGmt;
    private String commentContent;
    private Byte commentStatus;
    private Integer commentLikenum;
    private Long commentParent;

    public CommentVo(Long commentArchitectureId, Long commentAuthor, Long commentTarget, Date commentDate, Date commentDateGmt, String commentContent, Byte commentStatus, Integer commentLikenum, Long commentParent) {
        this.commentArchitectureId = commentArchitectureId;
        this.commentAuthor = commentAuthor;
        this.commentTarget = commentTarget;
        this.commentDate = commentDate;
        this.commentDateGmt = commentDateGmt;
        this.commentContent = commentContent;
        this.commentStatus = commentStatus;
        this.commentLikenum = commentLikenum;
        this.commentParent = commentParent;
    }

    public static CommentVo format(Comment comment) {
        return new CommentVo(comment.getCommentArchitectureId(), comment.getCommentAuthor(), comment.getCommentTarget(), comment.getCommentDate(),
                comment.getCommentDateGmt(), comment.getCommentContent(), comment.getCommentStatus(), comment.getCommentLikenum(), comment.getCommentParent());
    }

}
