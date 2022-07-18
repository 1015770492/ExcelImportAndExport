package top.yumbo.test.excel.importDemo;

//import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import top.yumbo.excel.annotation.business.MapEntry;
import top.yumbo.excel.annotation.core.ExcelTableHeader;
import top.yumbo.excel.annotation.core.ExcelTitleBind;

/**
 * 投资项目导入类
 * @author: Haiming Yu
 * @createDate:2022/7/14
 * @description:
 */
@Data
@ExcelTableHeader(height = 8, sheetName = "项目总表")
public class ImportForInveProj {

    /** 审批监管平台代码 */
    @ExcelTitleBind(title = "审批监管平台代码",nullable = true)
//    //@ApiModelProperty(value = "审批监管平台代码")
    private String supervisionCode;

    /** 项目名称 */
    @ExcelTitleBind(title = "项目名称")
    //@ApiModelProperty(value = "项目名称")
    private String projectName;

    /** 建设地点 */
    @ExcelTitleBind(title = "建设地点")
    //@ApiModelProperty(value = "建设地点")
    private String constructionAddress;

    /** 所属批次 */
    @ExcelTitleBind(title = "所属批次")
    //@ApiModelProperty(value = "所属批次")
    private String belongBatch;

    /** 行业分类 */
    @ExcelTitleBind(title = "行业分类")
    //@ApiModelProperty(value = "行业分类")
    private String industry;

    /** 建设内容及规模 */
    @ExcelTitleBind(title = "建设内容及规模")
    //@ApiModelProperty(value = "建设内容及规模")
    private String constructionContent;

    /** 项目推进情况 */
    @ExcelTitleBind(title = "项目推进情况")
    //@ApiModelProperty(value = "项目推进情况")
    private String progressDetail;

    /** 行业主管部门 */
    @ExcelTitleBind(title = "行业主管部门")
    //@ApiModelProperty(value = "行业主管部门")
    private String manageDepartment;

    /** 委内责任处室 */
    @ExcelTitleBind(title = "委内责任处室")
    //@ApiModelProperty(value = "委内责任处室")
    private String responsibleDepartment;

    /** 总投资 （万元） */
    @ExcelTitleBind(title = "总投资（万元）")
    //@ApiModelProperty(value = "总投资（万元）")
    private String totalInvestmentAmount;

    /** 开工以来累计完成投资 （万元） */
    @ExcelTitleBind(title = "开工以来累计完成投资（万元）")
    //@ApiModelProperty(value = "开工以来累计完成投资（万元）")
    private String allCumulativeInvestmentAmount;

    /** 本年累计完成投资 */
    @ExcelTitleBind(title = "本年累计完成投资")
    //@ApiModelProperty(value = "本年累计完成投资")
    private String thisYearCumulativeInvestmentAmount;

    /** 剩余投资 （万元） */
    @ExcelTitleBind(title = "剩余投资（万元）")
    //@ApiModelProperty(value = "剩余投资（万元）")
    private String leftInvestmentAmount;

    /** 2022年计划完成投资 （万元） */
    @ExcelTitleBind(title = "2022年计划完成投资（万元）")
    //@ApiModelProperty(value = "2022年计划完成投资（万元）")
    private String thisYearPlanInvestmentAmount;

    /** 录入月份 */
    @ExcelTitleBind(title = "录入月份")
    //@ApiModelProperty(value = "录入月份")
    private String inputMonth;

    /** 本月完成投资 */
    @ExcelTitleBind(title = "本月完成投资")
    //@ApiModelProperty(value = "本月完成投资")
    private String thisMonthFinishInvestmentAmount;

    /** 是否为省重大项目 */
    @ExcelTitleBind(title = "是否为省重大项目")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否为省重大项目")
    private String provinceKeyProject;

    /** 是否为省重中之重项目 */
    @ExcelTitleBind(title = "是否为省重中之重项目")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否为省重中之重项目")
    private String provinceMostKeyProject;

    /** 是否为市重大项目 */
    @ExcelTitleBind(title = "是否为市重大项目")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否为市重大项目")
    private String cityKeyProject;

    /** 是否为市重中之重项目 */
    @ExcelTitleBind(title = "是否为市重中之重项目")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否为市重中之重项目")
    private String cityMostKeyProject;

    /**是否为现代化基础设施建设项目*/
    @ExcelTitleBind(title = "是否为现代化基础设施建设项目")
    //@ApiModelProperty(value = "是否为现代化基础设施建设项目")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    private String isModernInfrastuctureProject;

    /**是否为现代化基础设施建设项目*/
    @ExcelTitleBind(title = "是否为现代化基础设施建设项目" )
    //@ApiModelProperty(value = "是否为现代化基础设施建设项目")
    private String modernInfrastuctureProject;

    /** 是否申报集中开工 */
    @ExcelTitleBind(title = "是否申报集中开工")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否申报集中开工")
    private String concentratedStart;

    /** 集中开工年份批次 */
    @ExcelTitleBind(title = "集中开工年份批次")
    //@ApiModelProperty(value = "集中开工年份批次")
    private String concentratedBatch;

    /** 是否已开工 */
    @ExcelTitleBind(title = "是否已开工")

    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否已开工")
    private String constructionStarted;

    /** 是否已入库 */
    @ExcelTitleBind(title = "是否已入库",replaceAll = true)
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否已入库")
    private String regulated;

    /** 开工时间 */
    @ExcelTitleBind(title = "开工时间")
    //@ApiModelProperty(value = "开工时间")
    private String constructionStartTime;

    /** 入库时间 */
    @ExcelTitleBind(title = "入库时间")
    //@ApiModelProperty(value = "入库时间")
    private String regulatedTime;

    /** 完工时间 */
    @ExcelTitleBind(title = "完工时间")
    //@ApiModelProperty(value = "完工时间")
    private String finishTime;

    /** 存在的问题和困难 */
    @ExcelTitleBind(title = "存在的问题和困难")
    //@ApiModelProperty(value = "存在的问题和困难")
    private String problems;

    /** 需协调解决事项 */
    @ExcelTitleBind(title = "需协调解决事项")
    //@ApiModelProperty(value = "需协调解决事项")
    private String coordinateResolutionProblem;

    /** 协调解决事项层级 */
    @ExcelTitleBind(title = "协调解决事项层级")
    //@ApiModelProperty(value = "协调解决事项层级")
    private String coordinateResolutionLevel;

    /** 需协调解决部门 */
    @ExcelTitleBind(title = "需协调解决部门")
    //@ApiModelProperty(value = "需协调解决部门")
    private String coordinateResolutionDepartment;

    /** 办理情况 */
    @ExcelTitleBind(title = "办理情况")
    //@ApiModelProperty(value = "办理情况")
    private String handleResult;

    /** 是否需信贷支持 */
    @ExcelTitleBind(title = "是否需信贷支持")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否需信贷支持")
    private String needCreditSupport;

    /** 是否申请地方政府专项债券 */
    @ExcelTitleBind(title = "是否申请地方政府专项债券")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否申请地方政府专项债券")
    private String applyLocalGovFund;

    /** 是否申请中央预算内投资 */
    @ExcelTitleBind(title = "是否申请中央预算内投资")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否申请中央预算内投资")
    private String applyCentralFund;

    /** 是否申请省预算内投资 */
    @ExcelTitleBind(title = "是否申请省预算内投资")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否申请省预算内投资")
    private String applyProvinceFund;

    /** 是否申请市级前期费 */
    @ExcelTitleBind(title = "是否申请市级前期费")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    //@ApiModelProperty(value = "是否申请市级前期费")
    private String applyCityFund;

    /** 地方政府专项债券资金情况下达年份批次 */
    @ExcelTitleBind(title = "地方政府专项债券资金情况下达年份批次")
    //@ApiModelProperty(value = "地方政府专项债券资金情况下达年份批次")
    private String localGovBatch;
    /** 地方政府专项债券资金情况资金类型 */
    @ExcelTitleBind(title = "地方政府专项债券资金情况资金类型")
    //@ApiModelProperty(value = "地方政府专项债券资金情况资金类型")
    private String localGovFoundType;
    /** 地方政府专项债券资金情况下达资金（万元） */
    @ExcelTitleBind(title = "地方政府专项债券资金情况下达资金（万元）")
    //@ApiModelProperty(value = "地方政府专项债券资金情况下达资金（万元）")
    private String localGovTotalAmount;
    /** 地方政府专项债券资金情况支付资金（万元） */
    @ExcelTitleBind(title = "地方政府专项债券资金情况支付资金（万元）")
    //@ApiModelProperty(value = "地方政府专项债券资金情况支付资金（万元）")
    private String localGovPayAmount;
    /** 地方政府专项债券资金情况支付进度 */
    @ExcelTitleBind(title = "地方政府专项债券资金情况支付进度")
    //@ApiModelProperty(value = "地方政府专项债券资金情况支付进度")
    private String localGovProgress;
    /** 中央预算内投资资金情况下达年份批次 */
    @ExcelTitleBind(title = "中央预算内投资资金情况下达年份批次")
    //@ApiModelProperty(value = "中央预算内投资资金情况下达年份批次")
    private String centerBatch;
    /** 中央预算内投资资金情况资金类型 */
    @ExcelTitleBind(title = "中央预算内投资资金情况资金类型")
    //@ApiModelProperty(value = "中央预算内投资资金情况资金类型")
    private String centerFoundType;
    /** 中央预算内投资资金情况下达资金（万元） */
    @ExcelTitleBind(title = "中央预算内投资资金情况下达资金（万元）")
    //@ApiModelProperty(value = "中央预算内投资资金情况下达资金（万元）")
    private String centerTotalAmount;
    /** 中央预算内投资资金情况支付资金（万元） */
    @ExcelTitleBind(title = "中央预算内投资资金情况支付资金（万元）")
    //@ApiModelProperty(value = "中央预算内投资资金情况支付资金（万元）")
    private String centerPayAmount;
    /** 中央预算内投资资金情况支付进度 */
    @ExcelTitleBind(title = "中央预算内投资资金情况支付进度")
    //@ApiModelProperty(value = "中央预算内投资资金情况支付进度")
    private String centerProgress;
    /** 省预算内投资资金情况下达年份批次 */
    @ExcelTitleBind(title = "省预算内投资资金情况下达年份批次")
    //@ApiModelProperty(value = "省预算内投资资金情况下达年份批次")
    private String provinceBatch;
    /** 省预算内投资资金情况资金类型 */
    @ExcelTitleBind(title = "省预算内投资资金情况资金类型")
    //@ApiModelProperty(value = "省预算内投资资金情况资金类型")
    private String provinceFoundType;
    /** 省预算内投资资金情况下达资金（万元） */
    @ExcelTitleBind(title = "省预算内投资资金情况下达资金（万元）")
    //@ApiModelProperty(value = "省预算内投资资金情况下达资金（万元）")
    private String provinceTotalAmount;
    /** 省预算内投资资金情况支付资金（万元） */
    @ExcelTitleBind(title = "省预算内投资资金情况支付资金（万元）")
    //@ApiModelProperty(value = "省预算内投资资金情况支付资金（万元）")
    private String provincePayAmount;
    /** 省预算内投资资金情况支付进度 */
    @ExcelTitleBind(title = "省预算内投资资金情况支付进度")
    //@ApiModelProperty(value = "省预算内投资资金情况支付进度")
    private String provinceProgress;


    /** 前期费项目下达年份批次 */
    @ExcelTitleBind(title = "前期费项目下达年份批次")
    //@ApiModelProperty(value = "前期费项目下达年份批次")
    private String cityBatch;

    /**前期费项目协议还款时间*/
    @ExcelTitleBind(title = "前期费项目协议还款时间")
    //@ApiModelProperty(value = "前期费项目协议还款时间")
    private java.util.Date cityAgreedRepaymentTime;

    /**前期费项目是否归还前期费*/
    @ExcelTitleBind(title = "前期费项目是否归还前期费")
    @MapEntry(key = "是", value = "1")
    @MapEntry(key = "否", value = "0")
    private String cityWhetherToReturnTheEarlyFee;

    /**前期费项目拨付金额（万元）*/
    @ExcelTitleBind(title = "前期费项目拨付金额（万元）")
    //@ApiModelProperty(value = "前期费项目拨付金额（万元）")
    private String cityAmountAllocated;

    /**前期费项目未还款金额（万元）*/
    @ExcelTitleBind(title = "前期费项目未还款金额（万元）")
    //@ApiModelProperty(value = "前期费项目未还款金额（万元）")
    private String cityOutstandingAmount;

    /** 前期费项目资金类型 */
    @ExcelTitleBind(title = "前期费项目资金类型")
    //@ApiModelProperty(value = "前期费项目资金类型")
    private String cityFoundType;

    /** 前期费项目下达资金（万元） */
    @ExcelTitleBind(title = "前期费项目下达资金（万元）")
    //@ApiModelProperty(value = "前期费项目下达资金（万元）")
    private String cityTotalAmount;

    /** 前期费项目支付资金（万元） */
    @ExcelTitleBind(title = "前期费项目支付资金（万元）")
    //@ApiModelProperty(value = "前期费项目支付资金（万元）")
    private String cityPayAmount;

    /** 前期费项目支付进度 */
    @ExcelTitleBind(title = "前期费项目支付进度")
    //@ApiModelProperty(value = "前期费项目支付进度")
    private String cityProgress;




    /** 项目业主 */
    @ExcelTitleBind(title = "项目业主")
    //@ApiModelProperty(value = "项目业主")
    private String enterpriseName;

    /** 负责人及联系电话 */
    @ExcelTitleBind(title = "负责人及联系电话")
    //@ApiModelProperty(value = "负责人及联系电话")
    private String contactNameAndPhone;

    /**标签*/
    @ExcelTitleBind(title = "标签")
    //@ApiModelProperty(value = "标签")
    private String tags;

    /** 备注 */
    @ExcelTitleBind(title = "备注")
    //@ApiModelProperty(value = "备注")
    private String remark;

}