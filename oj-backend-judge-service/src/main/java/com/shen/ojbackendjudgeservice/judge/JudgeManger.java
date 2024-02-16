package com.shen.ojbackendjudgeservice.judge;


import com.shen.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.shen.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.shen.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.shen.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.shen.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.shen.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManger {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        // 根据语言类型获取对应的策略
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
