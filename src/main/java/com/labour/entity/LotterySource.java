package com.labour.entity;

public class LotterySource {

    private static final long serialVersionUID = 1L;

    private String result;
    private String source;
    private Object issue;
    /**
     * @return the result
     */
    public String getresult() {
        return result;
    }
    /**
     * @param result the result to set
     */
    public void setresult(String result) {
        this.result = result;
    }
    /**
     * @return the source
     */
    public String getsource() {
        return source;
    }
    /**
     * @param source the source to set
     */
    public void setsource(String source) {
        this.source = source;
    }
    /**
     * @return the issue
     */
    public Object getissue() {
        return issue;
    }
    /**
     * @param issue the issue to set
     */
    public void setissue(Object issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Result [result=" + result + ", source=" + source + ", issue=" + issue + "]";
    }



}
