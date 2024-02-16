package com.shen.ojbackendserviceclient.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shen.ojbackendmodel.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.shen.ojbackendmodel.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.shen.ojbackendmodel.model.entity.QuestionSubmit;
import com.shen.ojbackendmodel.model.entity.User;
import com.shen.ojbackendmodel.model.vo.QuestionSubmitVO;

/**
 * @author Steven
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2023-12-19 23:00:36
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目提交封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目提交封装
     *
     * @param questionPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionPage, User loginUser);
}
