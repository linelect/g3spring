package com.springcourse;

import com.springcourse.Logger.Logger;

public class Event {
    private Logger logger;

    public void doEvent() {
      logger.log("Class Event do same event.");
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
