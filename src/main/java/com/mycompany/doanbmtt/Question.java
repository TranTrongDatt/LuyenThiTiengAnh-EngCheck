                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;

import java.util.ArrayList;
import java.util.List;

/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class Question {
    private int maCauHoi;
    private String noiDung;
    private String doKho;
    private List<Answer> answers;

    public Question(int maCauHoi, String noiDung, String doKho) {
        this.maCauHoi = maCauHoi;
        this.noiDung = noiDung;
        this.doKho = doKho;
        this.answers = new ArrayList<>();
    }

    public int getMaCauHoi() {
        return maCauHoi;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getDoKho() {
        return doKho;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public void addAnswers(List<Answer> answerList) {
        this.answers.addAll(answerList);
    }

    @Override
    public String toString() {
        return "Question{" +
                "maCauHoi=" + maCauHoi +
                ", noiDung='" + noiDung + '\'' +
                ", doKho='" + doKho + '\'' +
                ", answers=" + answers +
                '}';
    }
}


                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ