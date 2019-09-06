package com.demo.common.dalingjia;

import com.demo.common.GlobalVar;
import com.demo.common.annotation.GET;
import com.demo.common.annotation.Param;
import com.demo.common.annotation.PathVariable;
import com.demo.common.annotation.SERVER;
import com.jayway.restassured.response.Response;

import javax.xml.bind.annotation.XmlValue;

@SERVER(GlobalVar.DOUBAN_MOVIE_SERVER)
public interface Benefit {

    /**
     * @param
     */
    @GET(path = "/xc_sale/benefit/sumBenefit.do", description = "总累计收益")
    Response sumBenefit();

    @GET(path = "/xc_sale/benefit/sumBenefitHistogramTimeDimension.do", description = "7日收益图")
    Response sumBenefitHistogramTimeDimension(@Param("timeDimension") Integer timeDimension);

    @GET(path = "/xc_sale/benefit/sumBenefitTimeDimension.do", description = "今日7日/本月 上月收益")
    Response sumBenefitTimeDimension(@Param("timeDimension") Integer timeDimension);


    @GET(path = "/xc_empower/benefit/sumBenefitRefundTimeDimension.do", description = "时间维度查询店主累计收益与退款")
    Response sumBenefitRefundTimeDimension(@Param("timeDimension") Integer timeDimension);

    @GET(path = "/xc_sale/benefit/list.do", description = "收益明细")
    Response list(@Param("type") Integer type,
                  @Param("startDateStr") String startDateStr,
                  @Param("endDateStr") String endDateStr,
                  @Param("benefitTypes") Integer benefitTypes,
                  @Param("start") Integer start,
                  @Param("limit") Integer limit
    );


    @GET(path = "/xc_sale/benefit/shopPopularGoods.do", description = "查询店铺人气商品")
    Response shopPopularGoods(@Param("topN") Integer topN,
                              @Param("page") Integer page
    );

    @GET(path = "/xc_sale/benefit/popularGoods.do", description = "查询店铺人气商品")
    Response popularGoods(@Param("topN") Integer type,
                          @Param("page") Integer page
    );

    @GET(path = "/xc_sale/benefit/index.do", description = "店铺页资金管理")
    Response index();

    @GET(path = "/xc_sale/benefit/indexV1.do", description = "查询店铺首页数据")
    Response indexV1();

    @GET(path = "/xc_sale/empower/browse/top.do", description = "浏览轨迹")
    Response top(@Param("start") Integer start);

    @GET(path = "/xc_sale/empower/browse/traces.do", description = "浏览轨迹")
    Response traces(@Param("start") Integer start);

    @GET(path = "/xc_sale/empower/browse/push.do", description = "浏览轨迹-推送app")
    Response push(@Param("uid") String uid,
                  @Param("sku") String sku,
                  @Param("judgeDate") String judgeDate
    );

    @GET(path = "/xc_sale/empower/browse/visit.do", description = "浏览轨迹-访问历史")
    Response visit(@Param("uid") String uid,
                   @Param("start") Integer start);

    @GET(path = "/xc_sale/empower/browse/recomemend.do", description = "浏览轨迹-专属推荐")
    Response recomemend(@Param("uid") String uid,
                        @Param("start") Integer start,
                        @Param("inviteCode") String inviteCode,
                        @Param("browseDate") String browseDate
    );


}


