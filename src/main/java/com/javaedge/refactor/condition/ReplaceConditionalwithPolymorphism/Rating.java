package com.javaedge.refactor.condition.ReplaceConditionalwithPolymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author JavaEdge
 * @date 2022/4/10
 */
@Data
@AllArgsConstructor
public class Rating {

    private Voyage voyage;

    private History history;

    List<String> list = Arrays.asList("china", "east-indies");

    public Rating(Voyage voyage, History history) {
        this.voyage = voyage;
        this.history = history;
    }

    /**
     * 将3个分数组合到一起，给出一次航行的综合评级
     */
    public String rating(Voyage voyage, History history) {
        int vpf = voyageProfitFactor(voyage, history);
        int vr = getVoyageRisk(voyage);
        int chr = getCaptainHistoryRisk(voyage, history);
        if (vpf * 3 > (vr + chr * 2)) {
            return "A";
        } else {
            return "B";
        }
    }

    /**
     * 打出风险分数
     *
     * @return
     */
    public int getVoyageRisk(Voyage voyage) {
        int result = 1;
        if (voyage.length > 4) {
            result += 2;
        }
        if (voyage.length > 8) {
            result += voyage.length - 8;
        }
        if (list.contains(voyage.zone)) {
            result += 4;
        }
        return Math.max(result, 0);
    }

    /**
     * 打出风险分数
     */
    public int getCaptainHistoryRisk(Voyage voyage, History history) {
        int result = 1;
        if (history.length < 5) {
            result += 4;
        }
        result += history.length;
        return Math.max(result, 0);
    }

    public boolean hasChina(History history) {
        return "china".equals(history.zone);
    }

    /**
     * 打出盈利潜力分数
     */
    public int voyageProfitFactor(Voyage voyage, History history) {
        int result = 2;

        if ("china".equals(voyage.zone)) {
            result += 1;
        }
        if ("east-indies".equals(voyage.zone)) {
            result += 1;
        }
        result += this.historyLengthFactor();
        result += this.voyageLengthFactor();
        return result;
    }

    public int voyageLengthFactor() {
        int result = 0;
        if (voyage.length > 14) {
            result -= 1;
        }
        return result;
    }

    public int historyLengthFactor() {
        return (this.getHistory().length > 8) ? 1 : 0;
    }

}

class ExperiencedChinaRating extends Rating {

    public ExperiencedChinaRating(Voyage voyage, History history) {
        super(voyage, history);
    }

    public static Rating createRating(Voyage voyage, History history) {
        if ("china".equals(voyage.zone) && "china".equals(history.zone)) {
            return new ExperiencedChinaRating(voyage, history);
        } else {
            return new Rating(voyage, history);
        }
    }

    @Override
    public int getCaptainHistoryRisk(Voyage voyage, History history) {
        int result = super.getCaptainHistoryRisk(voyage, history) - 2;
        return Math.max(result, 0);
    }

    @Override
    public int voyageProfitFactor(Voyage voyage, History history) {
        return super.voyageProfitFactor(voyage, history) + 3;
    }

    @Override
    public int voyageLengthFactor() {
        int result = 0;

        if (this.getVoyage().length > 12) {
            result += 1;
        }
        if (this.getVoyage().length > 18) {
            result -= 1;
        }
        return result;
    }

    @Override
    public int historyLengthFactor() {
        return (this.getHistory().length > 10) ? 1 : 0;
    }
}
