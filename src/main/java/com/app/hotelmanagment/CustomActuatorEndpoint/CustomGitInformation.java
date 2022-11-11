package com.app.hotelmanagment.CustomActuatorEndpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomGitInformation implements InfoContributor {

    @Value("${git.branch}")
    private String branch;
    @Value("${git.build.host}")
    private String buildhost;
    @Value("${git.build.time}")
    private String buildTime;
    @Value("${git.build.user.email}")
    private String buildUseremail;

    @Value("${git.build.user.name}")
    private String buildUserName;

    @Value("${git.build.version}")
    private String buildVersion;

    @Value("${git.commit.committer.time}")
    private String commitTime;

    @Value("${git.commit.id}")
    private String commitID;

    @Value("${git.commit.user.email}")
    private String commitUserEmail;

    @Value("${git.commit.user.name}")
    private String commitUserName;

    @Value("${git.remote.origin.url}")
    private String commitURL;

    @Value("${git.total.commit.count}")
    private int commitCount;

    @Override
    public void contribute(Info.Builder builder) {

        Map<String, Object> gitInfo = new HashMap<>();
        gitInfo.put("Branch", branch);
        gitInfo.put("Host", buildhost);
        gitInfo.put("BuildTime", buildTime);
        gitInfo.put("BuildUsermail", buildUseremail);
        gitInfo.put("BuildUserName", buildUserName);
        gitInfo.put("BuildVersion", buildVersion);
        gitInfo.put("CommitID", commitID);
        gitInfo.put("CommitemailID", commitUserEmail);
        gitInfo.put("CommitUserName", commitUserName);
        gitInfo.put("CommitTime", commitTime);
        gitInfo.put("CommitURL", commitURL);
        gitInfo.put("commitCount",commitCount);
        builder.withDetail("Git commit Info", gitInfo);
    }
}