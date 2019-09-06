package com.dalingapi;

import com.demo.common.dalingjia.Benefit;
import com.demo.common.runner.BaseRunner;
import com.demo.common.utils.ProxyUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.demo.common.GlobalVar.HEADERS;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class TestBenefit extends BaseRunner {
    private Benefit benefit = ProxyUtils.create(Benefit.class);

    static {
        HEADERS.put("Accept-Encoding", "br, gzip, deflate");
        HEADERS.put("Connection", "keep-alive");
        HEADERS.put("province", "%E5%8C%97%E4%BA%AC%E5%B8%82");
        HEADERS.put("district", "%E4%B8%9C%E5%9F%8E%E5%8C%BA");
        HEADERS.put("User-Agent", "xc_app_rn/1.2.8.0 CFNetwork/978.0.7 Darwin/18.7.0");
        HEADERS.put("Accept", "*/*");
        HEADERS.put("clientid", "448092411329a0d259158e1cf152a16139d1aedf");
        HEADERS.put("brand", "apple");
        HEADERS.put("channel", "appstore");
        HEADERS.put("city", "%E5%8C%97%E4%BA%AC%E5%B8%82");
        HEADERS.put("xc_role", "1");
        HEADERS.put("version", "1.2.8");
        HEADERS.put("net", "WIFI");
        HEADERS.put("unionid", "o0RMh09zWldo_6lGN0MTTJocf3Xw");
        HEADERS.put("platform", "ios");
        HEADERS.put("uid", "0400000310401767021204314");
        HEADERS.put("ut", "2");
        HEADERS.put("apiversion", "2");
        HEADERS.put("Accept-Language", "zh-cn");
        HEADERS.put("bundle", "7ac69ade1c25db869a56558f1b031ae4");
        HEADERS.put("osversion", "12.4");
        HEADERS.put("model", "apple");
        HEADERS.put("jsversion", "0.2.21");
        HEADERS.put("xcrole", "1");
        HEADERS.put("blackbox", "eyJlcnJvck1zZyI6IkVycm9yIERvbWFpbj1jb2xsZWN0aW9uIHVuZmluaXNoZWQgQ29kZT0wIFwiKG51bGwpXCIiLCJvcyI6ImlPUyIsInNlcUlkIjoiMTU2NzY4MTc5MjEyMjI1MDg4NyIsImJsYWNrQm94IjoiZ1RkaWUzbjBDU3NDYVM0ZGxTUnZQSWpSSzgxUDdJNHVraVdLOHJMQm5UZnM1cXl2OVpiaG5BaHVXWXpCUDk2bTNvYkJrQmMyRnJVbmZJY3YySlh4OFJleWI1TjdtaTZhcUlrdjBYY3Q2cUljenYyVHl0QnRXQm9kV3JJeFFnY1lvZEVHMU1ONTVmbDJraGtPUXlhaWtUY1RrUGdcL1hHNFFcL2lTOGsrbmdlOFlqT2dyZitNV3hMT3BVMzNUQXpIQVU2dUdvcHRPV3djVDBlTDFzZHdhUE9wc3dSZmlhdUNiV2FpXC9hS2pNTjlhbXhWbUJabzJITGt3Q1ptSGVmdnpcLzdDQ1liYURiM3djNW1YR055djlCSDNHdkNqb1djWGhXXC9yTFBpZTVUT1NpdE5CbW1sWFNPZEFQK2JNSlJlVzZVZE1sdys2N1djMk0wK3FcL0t1bTFTclFiSFVpV3IycWNzWElBaDVcL2hZNURIOU9SdW83Vkw2aEFzZ0h6ekJcLzZrUGNBQ0NNaDYxUHdJcFVIYWtmMVAwZzNQRkF2TnhJUTlKbEVuWEdGQmpXZzJ4SUV4UjFcL0paanp6TEkzbXJJQUR0MDI3a0ljbkRkVEpnVWFHS0V6Kzlsd1hyUHJQQ0s5WVpEdGdJS3pleGZBXC81NGNUM1QweXVCREJxcTBVbHRaaWt5S3FVU1RCMlA4aHM3QlFIMWFEdVhmOWtlNVVlQmRcL1MzTGtKWCsyYWRwSUViSkF1UHdcL1pMdnFQeld2c3E4MWU3anoyRWpTbFduMVB6KyswSThUdWx3NFhCMVhublI4STFucWU3S05hMUw1WlRpMGxJSFRQdlVcLzBQV3pjVXM5Mmo2TFFDWEpGbkxDMVU3VmdUK3hSZmc0dEpcL3BOSFNwSEowVjlZb1d3U2lBVWZFOEVMSkxnY1NBZXI0UnNJS2VmUlwvTmlqd3lvbnRveFp4MHE0STRPNDRRQUxmY3dzQVZOWGRTcndoN1lpSFAxdzdVSHJ2dnM1TGdtUWNaWk02QlZvU2xmTVdcL2ZmZTU1NkJ6UzdCUWE0SUZLM1RcL05qdmNweHA5K1R0ZGFuc3YrRzFZMnRRZk01S1JPbTZwUUhUaDNkUUwxNlEzWENKYVA0V0UxTzlwcUwyMFAyMzhWdkQ0YUhkQzdjcHQ4cnlRdUVueXYrdGtjZTMzK2lYdWNFZFBLTHlNeUtcL0g5aXgzamVsODMxYk9aRTZCQk9mNWlwbUNMaytBM0dIckRtZmZIMEtDanBtQ1ZGY3ZQOGxTdU9JZE91eHYxek95bnRyQUtRNWtBWWJ4ZFVJcDZ2SVJ4eWtIa2JxNkM2QnlDVzR1WllxelwvTFZiSnFBUXBjdUhZY3VHZmtyRkNYZnIrcklQZnZEa09ab1FRV1RuNlVGWmh5TkFwUDdIT1wvNGhOSmFVc1hRZGRpelpXSmFMWGRQSk1yQ29rejRsQ0hva0gzYnMxMlV5aEpsNU5DdExkcmRTeHhZQXNPZkN2a2x3NjdIZXlZSldGS0RZaFF6YjJkcGlhVWJURENHQ0orZ3VcL0sxd280R0lkbnFGTnJ4TmVDT1l2bnlObFhaU0k1azVtdzVxYVE0OHh1XC83dnJ5XC9jVzFqcDZOUm5VXC9LTGpOa1wvQ096c1RNc1BsSFpDUGQrTWhYVktFTEI1TFpnSzZWT2NZekV0aG82ejFXYlUraVI1Smp5bmhVTTJzY1wvQSsyb3dEUHgxY3NyMnhwY2cyYnV4dUZKK2hLdGZ0ZkNFQlUwekptc3NiQXhiU1NsaFkrclZYYzE1N1lOREpPWTMwbzdycGo0TCs4S3NCVDdMKzZWZm55clBvcmk3bVN6bEJNOSt0SHMxUnZUVG11NkhRaGhQaldVUHRrZ0g1WlZkNkVNbG12N2xaUEpUaHd5cmFRcVAxOEExUGpyZUVSYk5cL3d4dWlzaVcydHRDbkdsRUN1eGoxYjdRVHA2S1k3c0dOaEFsd2RcLzlOcWd3KzlueFVvVlhFWUw5aUdXUU95MXpndVFYdjZlTG1rSDg1SGRKWDJ5UGxcL09uTzFRcXI1TUQ1QVFIYmNwNjNEQ3RyNGFTM2dOcmZJckswTHNONzI3M0RIOWU2MVZqbng0NGRWY0NmSEpMR0ZDQ1RhcW5GeVg3UmtmWjd3TER1MlRaZXdKR2psV0sydSsyalF2cVIrVFZvREJXWWNDdlZudm9seXRZOWlHV2xJMUFLTlB3b1NsK3ArdVd6cGNmSVwvVTljNGVSWGR0SkZRSDZlcmNuTVwvbThwOGVRUWN6TmxSUTU3N3dkWjN1VkFVamljYVhQK3h5ZTh3T0J3MlwvK3pjRFFUYVl2bndMM0ZObElhWktQaEFMNU9pRjR1Ykt4XC9seUMyRzJKQ3pqamhpcWdcL1pvakpjVVZsYW9Lb1ZYb0lqUXAxZVZyTUJvTGFQZmY1WEJQT2VrTExKUE9iZUk5anQ2QTJBY3lQYU8rWUpndWdGKzYxaXpzRnpIOXpBaEphNjNZNCtIdzdnZ1VaTVNhNVpZWWRSN3lDcDdLalNqMGtpWnJ0c1ZqOFhvbVlCbnlLTnJrTmdkM3dJbGlVMDdjV0NleUlDbm5MWnBWVkNkdnFcL0Juall5VXczZDBEMVVCK1wvMlFEZ2FrUGxtNklFMzcrU1hcL1U4N2xXTmRQbWZcLzNuVEVKZDVrVDVjQkI3dVZ2bmlYcUpORjVvQ3pYM0xoTHc3cWdtRnlieHZjTjdqSGtkbTgzcHlCeXJEQiswOWpEMG1IaEN1WXZkaDJ1enRXdjcrb2dcL1pMR1kxWmh4UE80PSIsInZlcnNpb24iOiIzLjIuNCJ9");
        HEADERS.put("utoken", "101411381-8634-548a4b0a-10e6-4575-9a5e-b504c5d138a6");
        HEADERS.put("Content-Type", "x-www-form-urlencoded");
        HEADERS.put("pushtoken", "64245f445ad1146e9e1d4e70ccc30dadbebc719cb6f792b3212b128d3529689d");
        HEADERS.put("app", "appstore");
        HEADERS.put("brand", "apple");



    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void sumBenefit() throws Exception {


        response = benefit.sumBenefit();
        response.then().body("errorMsg", equalTo("全部成功"));
    }


    @Test
    public void sumBenefitHistogramTimeDimension_Year() throws Exception {
        response = benefit.sumBenefitHistogramTimeDimension(1);
        response.then().body("errorMsg", equalTo("全部成功"));


    }
    @Test
    public void sumBenefitHistogramTimeDimension_Mouth() throws Exception {
        response = benefit.sumBenefitHistogramTimeDimension(3);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void sumBenefitTimeDimension_Yesterday() throws Exception {
        response = benefit.sumBenefitTimeDimension(0);
        response.then().body("errorMsg", equalTo("全部成功"));


    }
    @Test
    public void sumBenefitTimeDimension_Mouth() throws Exception {
        response = benefit.sumBenefitTimeDimension(1);
        response.then().body("errorMsg", equalTo("全部成功"));
    }
    @Test
    public void sumBenefitTimeDimension_Sum() throws Exception {
        response = benefit.sumBenefitTimeDimension(2);
        response.then().body("errorMsg", equalTo("全部成功"));
    }
    @Test
    public void sumBenefitTimeDimensionToday() throws Exception {
        response = benefit.sumBenefitTimeDimension(3);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void sumBenefitRefundTimeDimensionDay() throws Exception {
        response = benefit.sumBenefitRefundTimeDimension(3);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void sumBenefitTimeDimensionMouth() throws Exception {
        response = benefit.sumBenefitRefundTimeDimension(1);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void list1() throws Exception {
        Integer benefitTypes[]  = {1,2,3,4};
        response = benefit.list(1,"2018-10-31","2019-09-06",benefitTypes[0],3,4);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void list3() throws Exception {
        Integer benefitTypes[]  = {1,2,3,4};
        response = benefit.list(2,"2019-01-05","2019-09-06",benefitTypes[2],0,5);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void shopPopularGoods10() throws Exception {
        response = benefit.shopPopularGoods(10,1);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void shopPopularGoods100() throws Exception {
        response = benefit.shopPopularGoods(100,1);
        response.then().body("errorMsg", equalTo("全部成功"));
    }


    @Test
    public void popularGoods10() throws Exception {
        response = benefit.popularGoods(10,1);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void popularGoods100() throws Exception {
        response = benefit.popularGoods(100,2);
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void index() throws Exception {
        response = benefit.index();
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void indexV1() throws Exception {
        response = benefit.indexV1();
        response.then().body("errorMsg", equalTo("全部成功"));
    }

    @Test
    public void top() throws Exception {
        response = benefit.top(100);
        response.then().body("status", equalTo(599));
    }



}
