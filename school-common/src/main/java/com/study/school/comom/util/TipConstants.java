package com.study.school.comom.util;

/**
 * 提示常量信息<br/>
 *
 *
 */
public interface TipConstants {
    //public static final String Fund_Id_NotEmpty = "基金编号（Fund Id）不能为空";

	public static final String Id_LenError = "交易主键（Id）长度不正确，必须为32位字符串";

    public static final String Id_NotBlank = "交易主键（Id）不能为空";

    public static final String IdDetail_NotBlank = "交易明细主键（Id）不能为空";

    public static final String REFId_NotBlank = "关联主键（Id）不能为空";

    public static final String REFIdDetail_NotBlank = "交易明细关联主键（Id）不能为空";

    public static final String CustomerId_NotNull = "客户号（Customer Id）不能为null";

    public static final String UserID_NotNull = "用户号（User ID）不能为null";

    public static final String BranchCode_NotNull = "网点号（Branch Code）不能为null";

    public static final String TransCode_NotNull = "交易码（Trans Code）不能为null";

    public static final String SubTransCode_NotNull = "子交易码（Sub Trans Code）不能为null";

    public static final String ProductId_NotEmpty = "产品编码（Product Id）不能为空";

    public static final String Amount_NotNull = "金额/份额（Amound）不能为null";

    public static final String Amount_Gt0 = "金额/份额（Amound）必须大于0";

    public static final String Discount_NotNull = "折扣（Discount）不能为null";

    public static final String ApplyDate_NotEmpty = "申请日期（Apply Date）不能为空";

    public static final String ApplyTime_NotEmpty = "申请时间（Apply Time）不能为空";

    public static final String WorkDate_NotEmpty = "工作日（Work Date）不能为空";

    public static final String Source_NotNull = "交易来源（Source）不能为null";



    public static final String QutyDetail_NotEmpty = "份额明细列表(Quty Details)不能为空";

    public static final String QutyDetailVo_NotEmpty = "份额明细(Quty Detail)不能为空";

    public static final String InstId_NotBlank = "银行(InstId Index No)不能为空";

    public static final String CardIndexNo_NotBlank = "银行卡索引号(Card Index No)不能为空";

    public static final String BranchId_NotBlank = "银行通道(BranchId Index No)不能为空";

    public static final String ChannelType_NotBlank = "银行渠道(ChannelType Index No)不能为空";

    public static final String InstAccount_NotBlank = "银行内部号(InstAccount Index No)不能为空";

    public static final String PayStatus_NotBlank = "支付状态(PayStatus Index No)不能为空";

    public static final String PayDate_NotBlank = "支付日期(PayDate Index No)不能为空";

    public static final String PayTime_NotBlank = "支付时间(PayTime Index No)不能为空";

    public static final String CurrencyCode_NotNull = "货币类型（Currency Code）不能为null";

    public static final String ShareType_NotNull = "份额类别（Share Type）不能为null";

    public static final String CashType_NotNull = "份额类别（Cash Type）不能为null";

    public static final String Largeredflag_NotNull = "巨额赎回标志（Largered Flag）不能为null";

    public static final String OutProductId_NotEmpty = "转换产品编码（Out ProductId）不能为空";

    public static final String OutShareType_NotNull = "转换份额类别（Out ShareType）不能为null";

    public static final String Melonmd_NotNull = "分红方式（Melonmd）不能为null";



    public static final String Date_LenError = "日期长度不正确，格式为：yyyymmdd";

    public static final String Time_LenError = "时间长度不正确，格式为：HH24miss";

    public static final String Starting_PhaseError = "pipe line异步执行起始phase不能为null";


   public static final String FUNDACCT_EMPTY = "基金账户号不能为空";

   public static final String RETCODE_EMPTY = "TA确认代码不能为空";

   public static final String APKIND_EMPTY = "TA业务代码不能为空";

   public static final String TRADEACCO_EMPTY = "交易账户号不能为空";

   public static final String TANO_EMPTY = "TA编码不能为空";

}
