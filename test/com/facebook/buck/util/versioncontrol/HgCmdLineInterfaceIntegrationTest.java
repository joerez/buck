import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import java.io.InputStream;
import java.io.InputStreamReader;
    repoThreeCmdLine.diffBetweenRevisions("adf7a0", "adf7a0").get();
      throws VersionControlCommandFailedException, InterruptedException, IOException {
    try (InputStream diffFileStream =
        repoThreeCmdLine.diffBetweenRevisions("b1fd7e", "2911b3").get()) {
      InputStreamReader diffFileReader = new InputStreamReader(diffFileStream, Charsets.UTF_8);
      String actualDiff = CharStreams.toString(diffFileReader);
      assertEquals(String.join("\n", expectedValue), actualDiff);
    }