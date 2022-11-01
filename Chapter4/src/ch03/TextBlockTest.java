package ch03;

public class TextBlockTest {

	public static void main(String[] args) {

		//TextBlock ::: Java 13부터 제공
		String textBlocks = """
				Hello,
				hi,
				gggg""";
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>test</span>
					</body>
				</html>
				""";
	}

}
