package lib;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import java.util.List;

/**
 * @author yolo
 * @date 2020/1/7-19:32
 * 分词
 */
public class Demo3 {
    public static void main(String[] args) {
        String sentence = "中华人民共和国成立了！中国人民从此站起来了";
        List<Term> termList = NlpAnalysis.parse(sentence).getTerms();
        for (Term term : termList) {
            System.out.println(term.getNatureStr()+";"+term.getRealName());
        }
    }
}