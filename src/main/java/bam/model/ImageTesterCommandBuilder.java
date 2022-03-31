package bam.model;

public class ImageTesterCommandBuilder {

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
    private String threads;
    private String testName;
    private String batchName;
    private String batchId;
    private String batchSequenceName;
    private String adjustedViewportSize;
    private String pixelsToCutFromSides;
    private boolean sendBatchCompletionNotification;
    private String accessibilityGuidelinesVersion;
    private String ignoreRegions;
    private String applyContentRegions;
    private String applyLayoutRegions;
    private String pdfDPI;
    private String pdfPageRanges;
    private String pdfPassword;
    private String preservePDFNames;
    private boolean splitTestsIndividually;
    private boolean ignoreDisplacements;
    private boolean autoPassNewTests;
    private boolean closeBatchOnTestCompletion;

    public ImageTesterCommandBuilder apiKey(String apiKey) {
        this.apiKey = "-k " + apiKey;
        return this;
    }

    public ImageTesterCommandBuilder filePath(String filePath) {
        this.filePath = "-f " + filePath;
        return this;
    }

    public ImageTesterCommandBuilder appName(String appName) {
        this.appName = "-a " + appName;
        return this;
    }

    public ImageTesterCommandBuilder applitoolsURL(String applitoolsURL) {
        this.applitoolsURL = "-s" + applitoolsURL;
        return this;
    }

    public ImageTesterCommandBuilder matchLevel(String matchLevel) {
        this.matchLevel = "-ml " + matchLevel;
        return this;
    }

    public ImageTesterCommandBuilder branch(String branch) {
        this.branch = "-br " + branch;
        return this;
    }

    public ImageTesterCommandBuilder parentBranch(String parentBranch) {
        this.parentBranch = "-pb " + parentBranch;
        return this;
    }

    public ImageTesterCommandBuilder baseline(String baseline) {
        this.baseline = "-bn " + baseline;
        return this;
    }

    public ImageTesterCommandBuilder viewportSize(String viewportSize) {
        this.viewportSize = "-vs " + viewportSize;
        return this;
    }

    public ImageTesterCommandBuilder logFile(String logFile) {
        this.logFile = "-lf " + logFile;
        return this;
    }

    public ImageTesterCommandBuilder threads(int threads) {
        this.threads = "-th " + threads;
        return this;
    }

    public ImageTesterCommandBuilder testName(String testName) {
        this.testName = testName;
        return this;
    }

    public ImageTesterCommandBuilder batchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public ImageTesterCommandBuilder batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public ImageTesterCommandBuilder batchSequenceName(String batchSequenceName) {
        this.batchSequenceName = batchSequenceName;
        return this;
    }

    public ImageTesterCommandBuilder adjustedViewportSize(String adjustedViewportSize) {
        this.adjustedViewportSize = adjustedViewportSize;
        return this;
    }

    public ImageTesterCommandBuilder pixelsToCutFromSides(String pixelsToCutFromSides) {
        this.pixelsToCutFromSides = pixelsToCutFromSides;
        return this;
    }

    public ImageTesterCommandBuilder sendBatchCompletionNotification(boolean sendBatchCompletionNotification) {
        this.sendBatchCompletionNotification = sendBatchCompletionNotification;
        return this;
    }

    public ImageTesterCommandBuilder splitTestsIndividually(boolean splitTestsIndividually) {
        this.splitTestsIndividually = splitTestsIndividually;
        return this;
    }

    public ImageTesterCommandBuilder ignoreDisplacements(boolean ignoreDisplacements) {
        this.ignoreDisplacements = ignoreDisplacements;
        return this;
    }

    public ImageTesterCommandBuilder autoPassNewTests(boolean autoPassNewTests) {
        this.autoPassNewTests = autoPassNewTests;
        return this;
    }

    public ImageTesterCommandBuilder accessibilityGuidelinesVersion(String accessibilityGuidelinesVersion) {
        this.accessibilityGuidelinesVersion = accessibilityGuidelinesVersion;
        return this;
    }

    public ImageTesterCommandBuilder closeBatchOnTestCompletion(boolean closeBatchOnTestCompletion) {
        this.closeBatchOnTestCompletion = closeBatchOnTestCompletion;
        return this;
    }

    public ImageTesterCommandBuilder ignoreRegions(String ignoreRegions) {
        this.ignoreRegions = ignoreRegions;
        return this;
    }

    public ImageTesterCommandBuilder applyContentRegions(String applyContentRegions) {
        this.applyContentRegions = applyContentRegions;
        return this;
    }

    public ImageTesterCommandBuilder applyLayoutRegions(String applyLayoutRegions) {
        this.applyLayoutRegions = applyLayoutRegions;
        return this;
    }

    public ImageTesterCommandBuilder pdfDPI(String pdfDPI) {
        this.pdfDPI = pdfDPI;
        return this;
    }

    public ImageTesterCommandBuilder pdfPageRanges(String pdfPageRanges) {
        this.pdfPageRanges = pdfPageRanges;
        return this;
    }

    public ImageTesterCommandBuilder pdfPassword(String pdfPassword) {
        this.pdfPassword = pdfPassword;
        return this;
    }

    public ImageTesterCommandBuilder preservePDFNames(String preservePDFNames) {
        this.preservePDFNames = preservePDFNames;
        return this;
    }

    public ImageTester build() {
        return new ImageTester(this);
    }
}
