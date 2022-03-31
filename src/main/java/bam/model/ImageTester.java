package bam.model;

public class ImageTester {

    private String apiKey;
    private String filePath;
    private String appName;
    private String applitoolsURL;
    private String matchLevel;
    private String branch;
    private String parentBranch;
    private String baseline;
    private String viewportSize;
    private String logFile;
    private int threads;
    private String testName;
    private String batchName;
    private String batchId;
    private String batchSequenceName;
    private String adjustedViewportSize;
    private String pixelsToCutFromSides;
    private boolean sendBatchCompletionNotification;
    private boolean splitTestsIndividually;
    private boolean ignoreDisplacements;
    private boolean autoPassNewTests;
    private String accessibilityGuidelinesVersion;
    private boolean closeBatchOnTestCompletion;
    private String ignoreRegions;
    private String applyContentRegions;
    private String applyLayoutRegions;
    private String pdfDPI;
    private String pdfPageRanges;
    private String pdfPassword;
    private String preservePDFNames;

    public ImageTester(ImageTesterCommandBuilder imageTesterBuilder) {
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getApplitoolsURL() {
        return this.applitoolsURL;
    }

    public String getMatchLevel() {
        return this.matchLevel;
    }

    public String getBranch() {
        return this.branch;
    }

    public String getParentBranch() {
        return this.parentBranch;
    }

    public String baseline() {
        return this.baseline;
    }

    public String getViewportSize() {
        return this.viewportSize;
    }

    public String getLogFile() {
        return this.logFile;
    }

    public int getThreads() {
        return this.threads;
    }

    public String getTestName() {
        return this.testName;
    }

    public String getBatchName() {
        return this.batchName;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public String getBatchSequenceName() {
        return this.batchSequenceName;
    }

    public String getAdjustedViewportSize() {
        return this.adjustedViewportSize;
    }

    public String getPixelsToCutFromSides() {
        return this.pixelsToCutFromSides;
    }

    public boolean isSendBatchCompletionNotification() {
        return this.sendBatchCompletionNotification;
    }

    public boolean isSplitTestsIndividually() {
        return this.splitTestsIndividually;
    }

    public boolean isIgnoreDisplacements() {
        return this.ignoreDisplacements;
    }

    public boolean isAutoPassNewTests() {
        return this.autoPassNewTests;
    }

    public String getAccessibilityGuidelinesVersion() {
        return this.accessibilityGuidelinesVersion;
    }

    public boolean isCloseBatchOnTestCompletion() {
        return this.closeBatchOnTestCompletion;
    }

    public String getIgnoreRegions() {
        return this.ignoreRegions;
    }

    public String getApplyContentRegions() {
        return this.applyContentRegions;
    }

    public String getApplyLayoutRegions() {
        return this.applyLayoutRegions;
    }

    public String getPdfDPI() {
        return this.pdfDPI;
    }

    public String getPdfPageRanges() {
        return this.pdfPageRanges;
    }

    public String getPdfPassword() {
        return this.pdfPassword;
    }

    public String getPreservePDFNames() {
        return this.preservePDFNames;
    }
}
