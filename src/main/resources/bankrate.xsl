<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="bankrate.xsl" type="text/xsl"?>
<xsl:stylesheet
        version="2.0"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns="http://www.w3.org/1999/xhtml">
    <xsl:output method="html" indent="yes" encoding="UTF-8"/>
    <xsl:template match="bankrate">
        <html>
            <head>
                <title>Bank Rate XML 2 HTML Example</title>
            </head>
            <body>
                <h1>Bank Name and Bank Rate for loan</h1>
                <br/>
                The Bank Name found is:
                <xsl:value-of select="bankName"/>
                <br/>
                The Rate at this bank is:<xsl:value-of select="rate"/>%
                <br/>
                <br/>
                <br/>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
