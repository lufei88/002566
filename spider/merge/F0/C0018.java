package com.github.catvod.spider.merge.F0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.HBdcApi;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.XBPQa;
import com.github.catvod.spider.XiaoZhiTiao;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0229e;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0276f;
import com.github.catvod.spider.merge.e.C0280j;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0290a;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0320I;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.F0.ۨۡۨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0018 {

    /* renamed from: ۦۢ۠۠, reason: contains not printable characters */
    public static int f442 = -50;

    /* renamed from: ۟۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0172d m3881() {
        if (C0017.m3633() < 0) {
            return com.github.catvod.spider.merge.P0.n.k;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3882() {
        if (C0019.m4065() < 0) {
            return "firstPage=";
        }
        return null;
    }

    /* renamed from: ۟۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3883(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((AccessibilityNodeInfo) obj).isMultiLine();
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static StringBuffer m3884(Object obj, char c) {
        if (C0008.m1975() >= 0) {
            return ((StringBuffer) obj).append(c);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3885(Object obj) {
        if (C0044.m7508() < 0) {
            return ((C0233B) obj).o;
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3886(Object obj) {
        if (C0035.m6140() < 0) {
            return ((InterfaceC0416b) obj).isOpen();
        }
        return false;
    }

    /* renamed from: ۟۠۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3887(Object obj) {
        if (C0014.m3353() < 0) {
            return ((com.github.catvod.spider.merge.U0.E) obj).h;
        }
        return false;
    }

    /* renamed from: ۟۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.c m3888(Object obj) {
        if (m3956() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).h();
        }
        return null;
    }

    /* renamed from: ۟۠ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3889() {
        if (C0034.m6048() <= 0) {
            return "//proxy?do=settings', {\n            method: 'GET',\n            headers: {\n                'Content-Type': 'application/json'\n            }\n        }).then(response => {\n            if (!response.ok) throw new Error('请求失败');\n            return response.text();\n        }).then(data => {\n            console.log('设置请求成功:', data);\n        }).catch(error => {\n            console.error('设置请求失败:', error);\n        });\"\n    >\n        ⚙️\n    </button>\n    <!-- 主页界面-->\n    <div class=\"app-header\">\n        <i class=\"fas fa-tiger fa-2x\"></i>\n        <div class=\"title-group\">\n            <h1>小虎斑弹幕</h1>\n            <p class=\"subtitle\">全平台智能弹幕推送-推你想看</p>\n        </div>\n    </div>\n\n    <!-- 渐变分隔线-->\n    <div class=\"header-decoration\"></div>\n\n    <!-- 搜索区域 -->\n    <div class=\"search-container\">\n        <!-- 搜索框 -->\n        <div class=\"search-wrapper\">\n            <input \n                type=\"text\" \n                id=\"searchInput\"\n                name=\"do=seachdanmu&go=seach&juming\" \n                placeholder=\"输入剧名或关键词搜索\" \n                required \n                value=\"";
        }
        return null;
    }

    /* renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3890(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d0.F) obj).e();
        }
        return false;
    }

    /* renamed from: ۟۠ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3891(Object obj) {
        if (C0038.m6471() > 0) {
            Collections.reverse((List) obj);
        }
    }

    /* renamed from: ۟۠ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3892(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            ((ViewGroup) obj).removeView((View) obj2);
        }
    }

    /* renamed from: ۟ۡ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3893() {
        if (C0030.m5375() >= 0) {
            return "\" placeholder=\"请输入解析5\"\n                class=\"w-full p-3 border border-gray-300 rounded focus:ring-blue-500 focus:border-blue-500\">\n            <button type=\"submit\"\n                class=\"w-full bg-blue-500 text-white p-3 rounded hover:bg-blue-600 active:bg-blue-700\">提交</button>\n        </form>\n    </div>\n<script src=\"https://cdn.jsdelivr.net/npm/base64-js@1.5.1/base64js.min.js\"></script>    <script>\n        document.getElementById('inputForm').addEventListener('submit', function (e) {\n            e.preventDefault();\n            const input1 = encodeURIComponent(document.getElementById('input1').value);\n            const input2 = encodeURIComponent(document.getElementById('input2').value);\n            const input3 = encodeURIComponent(document.getElementById('input3').value);\n            const input4 = encodeURIComponent(document.getElementById('input4').value);\n            const input5 = encodeURIComponent(document.getElementById('input5').value);\n            const combined = input1 +\"nbxiaohuban\" +input2+\"nbxiaohuban\"+input3+\"nbxiaohuban\"+input4+\"nbxiaohuban\"+input5;\n            const targetUrl = 'http://";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m3894(Object obj) {
        if (C0011.m2755() > 0) {
            return ((XiaoZhiTiao) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3895() {
        if (C0047.m7837() >= 0) {
            return "\"?var.*";
        }
        return null;
    }

    /* renamed from: ۟ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3896(Object obj) {
        if (C0048.m7971() > 0) {
            return com.github.catvod.spider.merge.d0.b.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3897(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            return ((AppZzun) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U.k m3898() {
        if (C0024.m4693() <= 0) {
            return com.github.catvod.spider.merge.U.j.a;
        }
        return null;
    }

    /* renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3899(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).g();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3900(Object obj, boolean z, int i, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((TimeZone) obj).getDisplayName(z, i, (Locale) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3901(Object obj) {
        if (C0004.m1557() < 0) {
            ((C0304g) obj).d();
        }
    }

    /* renamed from: ۟ۢۦۤۥ, reason: not valid java name and contains not printable characters */
    public static float m3902(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0314C) obj).d;
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3903(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.N.a.g((LinkedHashMap) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m3904(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3905(Object obj) {
        if (C0064.m9659() <= 0) {
            ((C0067a) obj).a();
        }
    }

    /* renamed from: ۣ۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.R.d[] m3906(Object obj) {
        if (C0012.m3024() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).h;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3907() {
        if (C0059.m9257() < 0) {
            return "筛选语言名称";
        }
        return null;
    }

    /* renamed from: ۟ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3908(Object obj) {
        if (C0009.m2047() > 0) {
            ((com.github.catvod.spider.merge.O.c) obj).a();
        }
    }

    /* renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3909(Object obj) {
        if (C0050.m8121() < 0) {
            return ((C0229e) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3910(Object obj, boolean z) {
        if (C0043.m7332() >= 0) {
            ((TextView) obj).setAllCaps(z);
        }
    }

    /* renamed from: ۟ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3911(Object obj, boolean z, boolean z2) {
        if (C0023.m4566() < 0) {
            ((com.github.catvod.spider.merge.V0.p) obj).e(z, z2);
        }
    }

    /* renamed from: ۟ۤۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3912(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3913(Object obj) {
        if (C0053.m8389() > 0) {
            return com.github.catvod.spider.merge.M0.a.a((Class) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3914(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0042.m7147() <= 0) {
            return ((C0246g) obj).h((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3915(Object obj) {
        if (C0056.m8886() < 0) {
            return ((View) obj).getVisibility();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static Window m3916(Object obj) {
        if (m3956() >= 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3918(Object obj, Object obj2) {
        if (C0019.m4065() <= 0) {
            return ((AbstractCollection) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3919(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.U0.P) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.g1.c m3920() {
        if (C0002.m1242() >= 0) {
            return com.github.catvod.spider.merge.e1.d.b;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3921(String str) {
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

    /* renamed from: ۟ۥۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3922(Object obj, Object obj2) {
        if (C0011.m2755() >= 0) {
            return ((com.github.catvod.spider.merge.U.h) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۦۧۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3923(Object obj, int i) {
        if (C0051.m8216() <= 0) {
            return ((JSONArray) obj).getJSONObject(i);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3924(Object obj) {
        if (C0059.m9257() < 0) {
            return HBlingDu.d((Map) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3925(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).l();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3926(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0063.m9589() < 0) {
            ((Bitmap) obj).setPixels((int[]) obj2, i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: ۟ۦۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3927(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            ((Drawable) obj).setTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* renamed from: ۟ۦۣۥۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m3928(Object obj) {
        if (C0046.m7701() > 0) {
            return com.github.catvod.spider.merge.E0.h.d((com.github.catvod.spider.merge.E0.o) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m3929(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3930() {
        if (C0044.m7508() <= 0) {
            return "/@href";
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡۦ, reason: not valid java name and contains not printable characters */
    public static LocusId m3931(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((ShortcutInfo) obj).getLocusId();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m3932(Object obj) {
        if (C0054.m8557() < 0) {
            return ((View) obj).getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۣۣ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3933(Object obj, Object obj2) {
        if (C0048.m7971() > 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3934(Object obj) {
        if (C0017.m3633() < 0) {
            return ((C0144a) obj).f;
        }
        return 0;
    }

    /* renamed from: ۟ۧۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3935(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0276f) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3936() {
        if (C0064.m9659() < 0) {
            return com.github.catvod.spider.merge.a0.S.i();
        }
        return false;
    }

    /* renamed from: ۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m3937(Object obj) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.W.t) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3938() {
        if (C0042.m7147() <= 0) {
            return WindowInsets.CONSUMED;
        }
        return null;
    }

    /* renamed from: ۠۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Switch m3939(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((C0320I) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3940(Object obj, Object obj2) {
        if (C0052.m8320() > 0) {
            return ((Queue) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۠ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3941(Object obj) {
        if (C0061.m9359() < 0) {
            return ((IntBuffer) obj).arrayOffset();
        }
        return 0;
    }

    /* renamed from: ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3942(Object obj) {
        if (C0060.m9355() > 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).b;
        }
        return 0;
    }

    /* renamed from: ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static List m3943(Object obj) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.merge.l0.d) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m3944(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3945(Object obj) {
        if (C0008.m1975() > 0) {
            return ((com.github.catvod.spider.merge.W.z) obj).a;
        }
        return 0;
    }

    /* renamed from: ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3946() {
        if (C0006.m1726() < 0) {
            return "\\s+";
        }
        return null;
    }

    /* renamed from: ۡۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3947(Object obj) {
        if (C0012.m3024() > 0) {
            return ((com.github.catvod.spider.merge.Q.a) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.m m3948(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((C0176b) obj).a((com.github.catvod.spider.merge.T0.m) obj2);
        }
        return null;
    }

    /* renamed from: ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3949(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.merge.a0.M) obj).a((String) obj2, (Map) obj3, (Map) obj4, (Integer) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static C0271a m3950(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((C0280j) obj).a;
        }
        return null;
    }

    /* renamed from: ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static AlertDialog m3951(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((C0246g) obj).d;
        }
        return null;
    }

    /* renamed from: ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U0.M m3952(Object obj) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.U0.P) obj).k;
        }
        return null;
    }

    /* renamed from: ۢۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3953(Object obj) {
        if (C0050.m8121() < 0) {
            return ((C0315D) obj).f;
        }
        return 0;
    }

    /* renamed from: ۢۤۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3954(Object obj, boolean z) {
        if (C0028.m5152() < 0) {
            C0335o.h((Button) obj, z);
        }
    }

    /* renamed from: ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static URLConnection m3955(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* renamed from: ۢۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3956() {
        return (-398) ^ C0057.f842;
    }

    /* renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3957() {
        if (C0048.m7971() > 0) {
            return C0281k.g;
        }
        return 0;
    }

    /* renamed from: ۣۣۣۥ, reason: not valid java name and contains not printable characters */
    public static int m3958(Object obj) {
        if (C0025.m4797() > 0) {
            return ((DialogInterfaceOnDismissListenerC0243d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3959(Object obj, Object obj2, Object obj3, double d) {
        if (C0005.m1599() <= 0) {
            ((Market) obj).d((File) obj2, (InputStream) obj3, d);
        }
    }

    /* renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3960(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3961(Object obj) {
        if (C0024.m4693() < 0) {
            return ((Insets) obj).left;
        }
        return 0;
    }

    /* renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3962(Object obj) {
        if (C0062.m9429() > 0) {
            return ((TextPaint) obj).isElegantTextHeight();
        }
        return false;
    }

    /* renamed from: ۤ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3963(Object obj, int i) {
        if (C0013.m3167() >= 0) {
            return ((Drawable) obj).setLevel(i);
        }
        return false;
    }

    /* renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.a0.S m3964() {
        if (C0028.m5152() < 0) {
            return com.github.catvod.spider.merge.a0.Q.a;
        }
        return null;
    }

    /* renamed from: ۤۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static C0290a m3965() {
        if (C0048.m7971() >= 0) {
            return C0290a.b;
        }
        return null;
    }

    /* renamed from: ۤۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3966(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0054.m8557() < 0) {
            return ((HBdcApi) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3967(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            ((com.github.catvod.spider.merge.M.g) obj).f((String) obj2);
        }
    }

    /* renamed from: ۥۡ۟ۤ, reason: contains not printable characters */
    public static EditText m3968(Object obj) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.merge.a0.O) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static Object[] m3969(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((Set) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢۨۢ, reason: contains not printable characters */
    public static void m3970(Object obj) throws IOException {
        if (C0029.m5282() >= 0) {
            ((BufferedInputStream) obj).close();
        }
    }

    /* renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.Q.D m3971(Object obj, int i) {
        if (C0055.m8740() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.D) obj).c(i);
        }
        return null;
    }

    /* renamed from: ۥۣۤۦ, reason: contains not printable characters */
    public static boolean m3972(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return C0288g.f((View) obj, (View) obj2);
        }
        return false;
    }

    /* renamed from: ۥۥۦ, reason: contains not printable characters */
    public static String m3973(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((XBPQa) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۧۥۤ, reason: contains not printable characters */
    public static boolean m3974(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).equals(obj2);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge-xbpq.T.b>] */
    /* renamed from: ۦ۠۠۟, reason: contains not printable characters */
    public static ArrayList m3975(Object obj) {
        if (C0024.m4693() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.x) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static int m3976(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0315D) obj).h;
        }
        return 0;
    }

    /* renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static Charset m3977() {
        if (C0021.m4379() > 0) {
            return C0014.m3322();
        }
        return null;
    }

    /* renamed from: ۦۧۢۤ, reason: contains not printable characters */
    public static void m3978(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            com.github.catvod.spider.merge.U.n.a((com.github.catvod.spider.merge.U.n) obj, (ArrayList) obj2);
        }
    }

    /* renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static void m3979(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            ((HashMap) obj).putAll((Map) obj2);
        }
    }

    /* renamed from: ۧ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3980() {
        if (C0027.m5017() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
        return null;
    }

    /* renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3981(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((CookieManager) obj).getCookie((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3982(Object obj) {
        if (C0063.m9589() < 0) {
            return com.github.catvod.spider.merge.W.v.j((String) obj);
        }
        return null;
    }

    /* renamed from: ۨ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3983(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).C;
        }
        return null;
    }

    /* renamed from: ۨۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3984(Object obj, int i, int i2) {
        if (C0060.m9355() > 0) {
            ((com.github.catvod.spider.merge.H0.f) obj).b(i, i2);
        }
    }

    /* renamed from: ۨۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3985(Object obj, Object obj2) {
        if (C0044.m7508() <= 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3986() {
        if (C0036.m6252() > 0) {
            return "地区";
        }
        return null;
    }

    /* renamed from: ۨۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m3987(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((SSLSocket) obj).getApplicationProtocol();
        }
        return null;
    }

    /* renamed from: ۨۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m3988(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.merge.W.A) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3989(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).W((String) obj2);
        }
        return false;
    }

    /* renamed from: ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m3990() {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.d0.d.u;
        }
        return null;
    }

    /* renamed from: ۟ۤۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3917(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}