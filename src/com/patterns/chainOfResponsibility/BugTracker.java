package com.patterns.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManage("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManage("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManage("Houston, we've had a problem here!!", Priority.ASAP);
    }
}
