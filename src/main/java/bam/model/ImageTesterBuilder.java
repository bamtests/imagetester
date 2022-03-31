package bam.model;

public class ImageTesterBuilder {

    private String apiKey;
    private String filePath;
    private String appName;
    private String applitoolsURL;
    private String matchLevel;
    private String branch;
    private String parentBranch;
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

    public ImageTesterBuilder apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public ImageTesterBuilder filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public ImageTesterBuilder appName(String appName) {
        this.appName = appName;
        return this;
    }

    public ImageTesterBuilder applitoolsURL(String applitoolsURL) {
        this.applitoolsURL = applitoolsURL;
        return this;
    }

    public ImageTesterBuilder matchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
        return this;
    }

    public ImageTesterBuilder branch(String branch) {
        this.branch = branch;
        return this;
    }

    public ImageTesterBuilder parentBranch(String parentBranch) {
        this.parentBranch = parentBranch;
        return this;
    }

    public ImageTesterBuilder viewportSize(String viewportSize) {
        this.viewportSize = viewportSize;
        return this;
    }

    public ImageTesterBuilder logFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    public ImageTesterBuilder threads(String threads) {
        this.threads = threads;
        return this;
    }

    public ImageTesterBuilder testName(String testName) {
        this.testName = testName;
        return this;
    }

    public ImageTesterBuilder batchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public ImageTesterBuilder batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public ImageTesterBuilder batchSequenceName(String batchSequenceName) {
        this.batchSequenceName = batchSequenceName;
        return this;
    }

    public ImageTesterBuilder adjustedViewportSize(String adjustedViewportSize) {
        this.adjustedViewportSize = adjustedViewportSize;
        return this;
    }

    public ImageTesterBuilder pixelsToCutFromSides(String pixelsToCutFromSides) {
        this.pixelsToCutFromSides = pixelsToCutFromSides;
        return this;
    }

    public ImageTesterBuilder sendBatchCompletionNotification(boolean sendBatchCompletionNotification) {
        this.sendBatchCompletionNotification = sendBatchCompletionNotification;
        return this;
    }

    public ImageTesterBuilder splitTestsIndividually(boolean splitTestsIndividually) {
        this.splitTestsIndividually = splitTestsIndividually;
        return this;
    }

    public ImageTesterBuilder ignoreDisplacements(boolean ignoreDisplacements) {
        this.ignoreDisplacements = ignoreDisplacements;
        return this;
    }

    public ImageTesterBuilder autoPassNewTests(boolean autoPassNewTests) {
        this.autoPassNewTests = autoPassNewTests;
        return this;
    }

    public ImageTesterBuilder accessibilityGuidelinesVersion(String accessibilityGuidelinesVersion) {
        this.accessibilityGuidelinesVersion = accessibilityGuidelinesVersion;
        return this;
    }

    public ImageTesterBuilder closeBatchOnTestCompletion(boolean closeBatchOnTestCompletion) {
        this.closeBatchOnTestCompletion = closeBatchOnTestCompletion;
        return this;
    }

    public ImageTesterBuilder ignoreRegions(String ignoreRegions) {
        this.ignoreRegions = ignoreRegions;
        return this;
    }

    public ImageTesterBuilder applyContentRegions(String applyContentRegions) {
        this.applyContentRegions = applyContentRegions;
        return this;
    }

    public ImageTesterBuilder applyLayoutRegions(String applyLayoutRegions) {
        this.applyLayoutRegions = applyLayoutRegions;
        return this;
    }

    public ImageTesterBuilder pdfDPI(String pdfDPI) {
        this.pdfDPI = pdfDPI;
        return this;
    }

    public ImageTesterBuilder pdfPageRanges(String pdfPageRanges) {
        this.pdfPageRanges = pdfPageRanges;
        return this;
    }

    public ImageTesterBuilder pdfPassword(String pdfPassword) {
        this.pdfPassword = pdfPassword;
        return this;
    }

    public ImageTesterBuilder preservePDFNames(String preservePDFNames) {
        this.preservePDFNames = preservePDFNames;
        return this;
    }

    public ImageTester build() {
        return new ImageTester(this);
    }
}
