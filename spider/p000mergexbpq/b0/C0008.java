package com.github.catvod.spider.p000mergexbpq.b0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.HBAppfox;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBhcShun;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBtdou;
import com.github.catvod.spider.HBtiantian;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.Wcai;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.L.b;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.v;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U.o;
import com.github.catvod.spider.merge.U.p;
import com.github.catvod.spider.merge.U0.D;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.X0.j;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0309d;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.i1.c;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.e;
import com.github.catvod.spider.p000mergexbpq.P.l;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.k.i;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.b0.۟ۧ۠ۢۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0008 {

    /* renamed from: ۟ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int f174 = 353;

    /* renamed from: ۟۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1941() {
        if (C0036.m6252() >= 0) {
            return "innerHTML";
        }
        return null;
    }

    /* renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionInfo m1942(Object obj) {
        if (C0037.m6350() < 0) {
            return ((AccessibilityNodeInfo) obj).getCollectionInfo();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m1943(Object obj) {
        if (C0043.m7332() > 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m1944(Object obj) {
        if (C0029.m5282() > 0) {
            return ((a) obj).Q;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Socket m1945(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.l0.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1946() {
        if (C0041.m6823() <= 0) {
            return "||";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1947() {
        if (C0026.m4977() < 0) {
            return "特殊分类链接";
        }
        return null;
    }

    /* renamed from: ۟ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int[] m1948() {
        if (C0034.m6048() < 0) {
            return com.github.catvod.spider.p000mergexbpq.l.a.a;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1949(Object obj) {
        if (C0010.m2320() < 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static p m1950() {
        if (C0027.m5017() > 0) {
            return o.a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m1951(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            return ((j) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static ServerSocket m1952(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((m) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۡۦ۠۟, reason: not valid java name and contains not printable characters */
    public static h m1953() {
        if (C0023.m4566() <= 0) {
            return n.w;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1954(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Cupfox) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m1955(Object obj) throws IOException {
        if (C0025.m4797() >= 0) {
            ((InputStream) obj).close();
        }
    }

    /* renamed from: ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1956(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۢۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1957(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, int i, boolean z3) {
        if (C0037.m6350() <= 0) {
            ((L) obj).f((C0145b) obj2, (C0148e) obj3, (HashSet) obj4, z, z2, i, z3);
        }
    }

    /* renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1958() {
        if (C0012.m3024() > 0) {
            return "筛选数据";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1959(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((v) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1960(Object obj) {
        if (C0016.m3596() <= 0) {
            ((W) obj).e();
        }
    }

    /* renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static List m1961() {
        if (C0035.m6140() <= 0) {
            return Collections.emptyList();
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1962(Object obj, Object obj2) {
        if (C0054.m8557() < 0) {
            return ((C0254o) obj).i((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1963(Object obj, Object obj2, Object obj3, int i) {
        if (C0024.m4693() <= 0) {
            return ((Youku) obj).e((String) obj2, (HashMap) obj3, i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static JSONArray m1964(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            return ((JSONObject) obj).optJSONArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1965(int i, int i2) {
        if (C0053.m8389() >= 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m1966(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((HBlingDu) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1967(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).h((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1968(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((e) obj).isExternal();
        }
        return false;
    }

    /* renamed from: ۟ۤۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1969(Object obj, Object obj2) {
        if (C0058.m9131() <= 0) {
            ((D) obj).a((com.github.catvod.spider.merge.T0.c) obj2);
        }
    }

    /* renamed from: ۟ۥۧۦۢ, reason: not valid java name and contains not printable characters */
    public static float m1971(Object obj) {
        if (C0011.m2755() > 0) {
            return ((C0314C) obj).g;
        }
        return 0.0f;
    }

    /* renamed from: ۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static HashMap m1972(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return Wcai.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1973(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.H0.e) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1974(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((HBtiantian) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1975() {
        return (-149) ^ C0035.f685;
    }

    /* renamed from: ۟ۦۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.D m1976(Object obj, Object obj2, int i, Object obj3, int i2, int i3, int i4, int i5, int i6) {
        if (C0013.m3167() >= 0) {
            return ((l) obj).a((com.github.catvod.spider.p000mergexbpq.S.l) obj2, i, (String) obj3, i2, i3, i4, i5, i6);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static int m1977(Object obj) {
        if (C0047.m7837() > 0) {
            return ((B) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1978(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((M) obj).k;
        }
        return false;
    }

    /* renamed from: ۟ۦۥۧۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m1979(Object obj) {
        if (m1975() > 0) {
            return ((com.github.catvod.spider.merge.E0.h) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1980(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1981() {
        if (C0009.m2047() > 0) {
            return "时长";
        }
        return null;
    }

    /* renamed from: ۟ۧۡۦۨ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m1982(Object obj) {
        if (C0025.m4797() > 0) {
            return ((Init) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1983(Object obj, boolean z) {
        if (C0017.m3633() <= 0) {
            ((Paint) obj).setAntiAlias(z);
        }
    }

    /* renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1984() {
        if (C0064.m9659() <= 0) {
            return "调试->playerContent出错：";
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1985(Object obj, float f, float f2, float f3, float f4) {
        if (C0031.m5628() >= 0) {
            ((RectF) obj).set(f, f2, f3, f4);
        }
    }

    /* renamed from: ۠۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1986(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0036.m6252() >= 0) {
            return ((HBhcShun) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1987(Object obj, Object obj2, int i) {
        if (C0042.m7147() <= 0) {
            com.github.catvod.spider.merge.T0.o.a((Appendable) obj, (com.github.catvod.spider.merge.T0.n) obj2, i);
        }
    }

    /* renamed from: ۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1988(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((a) obj).n0;
        }
        return null;
    }

    /* renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1989(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((URI) obj).getScheme();
        }
        return null;
    }

    /* renamed from: ۡ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static X509TrustManager m1990() {
        if (C0047.m7837() > 0) {
            return i.d;
        }
        return null;
    }

    /* renamed from: ۡۡ۟۠, reason: not valid java name and contains not printable characters */
    public static h m1991() {
        if (C0009.m2047() >= 0) {
            return n.y;
        }
        return null;
    }

    /* renamed from: ۡۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1992() {
        if (C0054.m8557() < 0) {
            return "/proxy?do=settings', {\n            method: 'GET',\n            headers: {\n                'Content-Type': 'application/json'\n            }\n        }).then(response => {\n            if (!response.ok) throw new Error('请求失败');\n            return response.text();\n        }).then(data => {\n            console.log('设置请求成功:', data);\n        }).catch(error => {\n            console.error('设置请求失败:', error);\n        });\"\n    >\n        ⚙️\n    </button>\n    <!-- 主页界面-->\n    <div class=\"app-header\">\n        <i class=\"fas fa-tiger fa-2x\"></i>\n        <div class=\"title-group\">\n            <h1>小虎斑弹幕</h1>\n            <p class=\"subtitle\">全平台智能弹幕推送-推你想看</p>\n        </div>\n    </div>\n\n    <!-- 渐变分隔线-->\n    <div class=\"header-decoration\"></div>\n\n    <!-- 搜索区域 -->\n    <div class=\"search-container\">\n        <!-- 搜索框 -->\n        <div class=\"search-wrapper\">\n            <input \n                type=\"text\" \n                id=\"searchInput\"\n                name=\"do=seachdanmu&go=seach&juming\" \n                placeholder=\"输入剧名或关键词搜索\" \n                required \n                tabindex=\"0\"\n            />\n            <button type=\"button\" onclick=\"handleSearch()\" tabindex=\"0\">\n                <i class=\"fas fa-search\"></i>\n            </button>\n        </div>\n\n        <!-- 三按钮行 -->\n        <div class=\"button-row\">\n            <button class=\"action-btn full-btn\" data-type=\"search\" onclick=\"fastSearch()\" tabindex=\"0\">\n                <i class=\"fas fa-play-circle\"></i> 快搜播放\n            </button>\n            <button class=\"action-btn full-btn\" data-type=\"qrcode\" onclick=\"sendBackgroundRequest()\" tabindex=\"0\">\n                <i class=\"fas fa-qrcode\"></i> 电视推送\n            </button>\n            <button class=\"action-btn full-btn\" data-type=\"danmu\" id=\"toggleDanmuBtn\" tabindex=\"0\">\n                <i class=\"fas fa-comment-dots\"></i> 发弹幕\n            </button>\n        </div>\n    </div>\n\n    <!-- 弹幕输入面板 -->\n    <div id=\"danmuPanel\" style=\"display: none;\">\n        <textarea id=\"danmuMessage\" placeholder=\"输入弹幕内容\" rows=\"2\"></textarea>\n        <div style=\"margin-bottom: 8px; font-size: 13px;\">\n            <label for=\"danmuUsername\" style=\"display: inline-block; width: 50px;\">昵称：</label>\n            <input type=\"text\" id=\"danmuUsername\" placeholder=\"请输入昵称\" value=\"";
        }
        return null;
    }

    /* renamed from: ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1993(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0006.m1726() < 0) {
            return ((C0232A) obj).a((String) obj2, (Map) obj3, (Map) obj4, (Integer) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1994() {
        if (C0041.m6823() <= 0) {
            return "番";
        }
        return null;
    }

    /* renamed from: ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String[] m1995() {
        if (C0003.m1463() < 0) {
            return d.f;
        }
        return null;
    }

    /* renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m1996(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((com.github.catvod.spider.merge.X0.b) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۢ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1997(Object obj) {
        if (C0014.m3353() < 0) {
            com.github.catvod.spider.merge.g0.e.v((File) obj);
        }
    }

    /* renamed from: ۢ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1998(Object obj) {
        if (C0011.m2755() > 0) {
            ((Q) obj).b();
        }
    }

    /* renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1999(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((a) obj).e0;
        }
        return null;
    }

    /* renamed from: ۢۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2000(Object obj) {
        if (C0029.m5282() > 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* renamed from: ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2001(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((Symx) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Bitmap m2002(int i, Object obj) {
        if (C0002.m1242() > 0) {
            return com.github.catvod.spider.merge.g0.e.k(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static String m2003() {
        if (C0042.m7147() < 0) {
            return "\\[";
        }
        return null;
    }

    /* renamed from: ۣۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Bitmap m2004(Object obj, int i) {
        if (C0033.m5872() > 0) {
            return ThumbnailUtils.createVideoThumbnail((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۣۥۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2005(Object obj) {
        if (C0033.m5872() > 0) {
            return ((HBAppfox) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2006(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            ((Consumer) obj).accept(obj2);
        }
    }

    /* renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2007(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).j();
        }
        return false;
    }

    /* renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m2008(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((HBDmSou) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2009(Object obj) {
        if (C0029.m5282() > 0) {
            com.github.catvod.spider.merge.A0.b.b((String) obj);
        }
    }

    /* renamed from: ۤۧۦۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m2010(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.p) obj).w();
        }
        return null;
    }

    /* renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static String m2011(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static HashMap m2012() {
        if (C0012.m3024() >= 0) {
            return AbstractC0309d.b;
        }
        return null;
    }

    /* renamed from: ۥۢۨۧ, reason: contains not printable characters */
    public static String m2013(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* renamed from: ۥۧ۟ۡ, reason: contains not printable characters */
    public static int m2014(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.V0.l) obj).b((com.github.catvod.spider.merge.T0.m) obj2);
        }
        return 0;
    }

    /* renamed from: ۦۡ۠ۦ, reason: contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m2015() {
        if (C0014.m3353() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }
        return null;
    }

    /* renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static String m2016(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0018.m3956() >= 0) {
            return ((HBtdou) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static void m2017(Object obj) {
        if (C0030.m5375() > 0) {
            com.github.catvod.spider.merge.W.B.a((WebView) obj);
        }
    }

    /* renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static int m2018() {
        if (C0059.m9257() < 0) {
            return com.github.catvod.spider.p000mergexbpq.j.o.a;
        }
        return 0;
    }

    /* renamed from: ۦۥۢ۟, reason: contains not printable characters */
    public static Iterator m2019(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((HashSet) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۦۧ۟ۦ, reason: contains not printable characters */
    public static AlertDialog.Builder m2020(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return ((AlertDialog.Builder) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
        return null;
    }

    /* renamed from: ۦۨۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge-xbpq.Q.e m2021(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((f) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۨۨۡ, reason: contains not printable characters */
    public static String m2022(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0009.m2047() >= 0) {
            return ((com.github.catvod.spider.merge.V.b) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۧۢ۠۠, reason: not valid java name and contains not printable characters */
    public static long m2023(Object obj) {
        if (C0005.m1599() < 0) {
            return Long.parseLong((String) obj);
        }
        return 0L;
    }

    /* renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.q0.e m2024() {
        if (C0017.m3633() < 0) {
            return com.github.catvod.spider.merge.q0.e.a;
        }
        return null;
    }

    /* renamed from: ۨ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m2025(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((NG) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2026(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            ((com.github.catvod.spider.merge.G.c) obj).n((String) obj2);
        }
    }

    /* renamed from: ۨ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2027(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((HBv1Class) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2028(Object obj) {
        if (C0037.m6350() < 0) {
            return ((Config) obj).i;
        }
        return null;
    }

    /* renamed from: ۨۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2029(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.Z.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1970(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}