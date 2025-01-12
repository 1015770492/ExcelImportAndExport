package top.yumbo.excel.annotation.core;


import java.lang.annotation.*;

/**
 * @author jinhua
 * @date 2021/5/21 15:53
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ExcelTitleBinds.class)
public @interface ExcelTitleBind {
    /**
     * 绑定的标题名称，
     * 通过扫描单元格表头可以确定表头所在的索引列，然后在根据width就能确定单元格
     */
    String title() default "";

    /**
     * 重复标题头处理，默认根据如果有 下划线 "_" 对标题头进行拆分
     *
     */
    String titleSplit() default "_";

    /**
     * 单元格宽度，对于合并单元格的处理
     * 确定表格的位置采用： 下标（解析过程会得到下标） + 单元格的宽度
     * 这样就可以确定单元格的位子和占据的宽度
     */
    int width() default 1;

    /**
     * 对于合并单元格 以及 多个单元格内容合并 内容时
     * 为了方便再次拆出来，默认使用$$进行拼接
     * 例如 A单元格内容为hello，B单元格内容为world
     * 如果A，B相邻 则变成 hello$$world
     * 如果A，B不相邻 则变成 hello$$$$world
     * 如果A是合并单元格，B也是合并单元格并且AB不相邻,则会使用double join进行拼接
     * 如果A的内容分别是 "I am zhanSan", "comes from china"
     * B的内容是 "I like apple", "does not like origin"
     * 则可能会得到这种格式："I am zhanSan$$comes from china$$$$I like apple$$does not like origin"
     */
    String join() default "$$";


    /**
     * 注入的异常消息，为了校验单元格内容
     * 校验失败应该返回的消息提升
     */
    String exception() default "格式不正确";

    /**
     * 规模，对于BigDecimal类型的需要进行转换
     */
    String size() default "1";

    /**
     * 正则截取单元格内容，保留单元格内容，后面进行替换字典
     * 服务于replaceAllOrPart，如果使用了splitRegex，则会将内容切割进行replaceAllOrPart
     * 然后将将处理后的结果返回，然后再进行importPattern
     */
    String splitRegex() default "";

    /**
     * 正则截取单元格部分内容，只需要部分其它内容丢掉
     * 一个单元格中的部分内容，例如 2020年2季度，只想单独取出年、季度这两个数字
     */
    String importPattern() default "";

    /**
     * 默认替换所有内容
     * 如果replaceAll={1}则替换第一个，replaceAll=2替换第二次出现的内容以此类推
     */
    int[] replaceAll() default {};

    /**
     * replaceAllType 主要针对多个
     * 例如：
     *-- @ExcelTitleBind(replaceAll={1})
     *-- @ExcelTitleBind(replaceAll={2})
     *   private String code;
     * 对 replaceAll 的作用效果
     * 0：只影响注解信息自己
     * 1：是先合并 再替换（多个replaceAll的注解会合成一个，然后根据合成的结果进行replace）
     * 等同于
     * @ExcelTitleBind(replaceAll={1, 2})
     */
    int replaceAllType() default 0;

    /**
     * 导出的字符串格式化填入，利用StringFormat.format进行字符串占位和替换
     */
    String exportFormat() default "";

    /**
     * 导出功能，该字段可能是多个单元格的内容（连续单元格），按照split拆分和填充。默认逗号
     */
    String exportSplit() default "";

    /**
     * 合并多个字段的顺序，多个字段构成一个标题，例如时间 年+季度
     */
    int exportPriority() default 0;

    /**
     * 默认可以为空
     */
    boolean nullable() default true;

    /**
     * 单元格索引位置，如果标题重复，没法通过标题来得到index，则可以通过 positionTitle() + offset() 来更新
     */
    String index() default "-1";

    /**
     * 重复标题的处理方案：利用不重复标题的位置 positionTitle + 当前标题到不重复标题的偏移offset量
     * 这样就可以不写死index
     * 定位
     */
    String positionTitle() default "";

    /**
     * 偏移
     */
    int offset() default 1;


}
