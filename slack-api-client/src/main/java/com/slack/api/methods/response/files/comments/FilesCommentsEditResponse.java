package com.slack.api.methods.response.files.comments;

import com.slack.api.methods.SlackApiResponse;
import com.slack.api.model.FileComment;
import lombok.Data;

@Data
public class FilesCommentsEditResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private FileComment comment;
}