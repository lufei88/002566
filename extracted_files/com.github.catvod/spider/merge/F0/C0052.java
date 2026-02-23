package com.github.catvod.spider.merge.f0;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.location.GnssStatus;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.core.view.MenuHostHelper;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.HBgetappapi;
import com.github.catvod.spider.HBoFun;
import com.github.catvod.spider.HBrenren;
import com.github.catvod.spider.HBtianQdj;
import com.github.catvod.spider.KuaKeS;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Tianyi;
import com.github.catvod.spider.WebDAV;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.F.j;
import com.github.catvod.spider.merge.F0.V;
import com.github.catvod.spider.merge.F0.W;
import com.github.catvod.spider.merge.F0.Z;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U0.L;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0257s;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0292c;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0333m;
import com.github.catvod.spider.merge.h0.RunnableC0322b;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w.C0401e;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.Inflater;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.f0.۟ۦۣ۠ۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0052 {

    /* renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f790 = -752;

    /* renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8284(Object obj) {
        if (m8320() > 0) {
            return ((File) obj).canWrite();
        }
        return false;
    }

    /* renamed from: ۟۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8285(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0004.m1557() <= 0) {
            return ((HBoFun) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m8286() {
        if (C0039.m6529() <= 0) {
            return "type_name";
        }
        return null;
    }

    /* renamed from: ۟۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8287(Object obj) {
        if (C0013.m3167() > 0) {
            return KuaKeS.b((h) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static C0124g m8288(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((l) obj).j0((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8289(Object obj) {
        if (C0028.m5152() < 0) {
            return ((RunnableC0322b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠۠۟۟, reason: not valid java name and contains not printable characters */
    public static int m8290(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟۠۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8291() {
        if (C0017.m3633() < 0) {
            return "\">\n        <button onclick=\"handleSearch()\" tabindex=\"0\" type=\"button\">\n            🔍 搜索\n        </button>\n    </div>\n\n    <!-- 三按钮行 -->\n    <div class=\"button-row\">\n        <button class=\"action-btn full-btn\" data-type=\"search\" onclick=\"fastSearch()\" tabindex=\"0\">\n            ⚡ 快搜播放\n        </button>\n        <button class=\"action-btn full-btn\" data-type=\"qrcode\" onclick=\"sendBackgroundRequest()\" tabindex=\"0\">\n            📱 扫码推送\n        </button>\n        <button class=\"action-btn full-btn\" data-type=\"danmu\" id=\"toggleDanmuBtn\" tabindex=\"0\">\n            📝 发送弹幕\n        </button>\n    </div>\n</div>    <!-- 操作状态提示 -->\n<div id=\"statusMessage\" class=\"status-message\"></div>\n\n<!-- JavaScript 逻辑 -->\n<script>\n    // 缓存 DOM 元素\n    const searchInput = document.getElementById('searchInput');\n    const toggleDanmuBtn = document.getElementById('toggleDanmuBtn');\n    const statusMessage = document.getElementById('statusMessage');\n    let danmuPanel = null; // 弹幕面板引用\n    let isPanelVisible = false; // 面板状态\n\n    const focusable = document.querySelectorAll('a[href], button, input, textarea');\n    const focusArray = Array.from(focusable).filter(el => !el.disabled && el.tabIndex !== -1);\n    let currentIndex = 0;\n\n    if (focusArray.length > 0) {\n        focusArray[0].focus();\n    }\n\n    // 搜索处理\n    function handleSearch() {\n        const value = searchInput.value.trim();\n        if (!value) return showStatus('请输入搜索内容', 'failure');\n        const paramName = searchInput.getAttribute('name');\n        const url = `";
        }
        return null;
    }

    /* renamed from: ۟۠ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static j m8292(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.F.l) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۠ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m8293(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((IntBuffer) obj).array();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8294(Object obj) {
        if (C0013.m3167() > 0) {
            ((q) obj).a();
        }
    }

    /* renamed from: ۟ۡۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8295(Object obj) {
        if (C0031.m5628() > 0) {
            return com.github.catvod.spider.merge.g0.e.m((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8296(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((k) obj).h;
        }
        return 0;
    }

    /* renamed from: ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8297(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            return com.github.catvod.spider.merge.E.g.t((ArrayList) obj, (JSONObject) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8298(Object obj, int i) {
        if (C0050.m8121() < 0) {
            ((C0273c) obj).e(i);
        }
    }

    /* renamed from: ۟ۢۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m8299(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            S.c((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m8300(Object obj, int i) {
        if (C0032.m5686() <= 0) {
            return ((C0281k) obj).g(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static d0[] m8301(Object obj) {
        if (C0005.m1599() < 0) {
            return ((Z) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8302() {
        if (m8320() > 0) {
            return "dtDirector";
        }
        return null;
    }

    /* renamed from: ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static M m8303(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((L) obj).p();
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8304(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.l0.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m8305(Object obj) {
        if (m8320() > 0) {
            return HBgetappapi.ger302((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8306(Object obj) {
        if (C0043.m7332() >= 0) {
            ((Inflater) obj).reset();
        }
    }

    /* renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m8307(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((p) obj).b();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static Throwable m8308(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((Throwable) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8309(Object obj) {
        if (C0003.m1463() < 0) {
            return ((O) obj).k();
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m8310(Object obj) {
        if (C0020.m4210() <= 0) {
            return com.github.catvod.spider.merge.E0.h.e((com.github.catvod.spider.merge.E0.d) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static MainActivity m8311(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.T.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8312(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.O.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8313(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((Bili) obj).b;
        }
        return false;
    }

    /* renamed from: ۣ۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8314(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((HBtianQdj) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8315(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((O) obj).e();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8316(Object obj, boolean z) {
        if (C0014.m3353() < 0) {
            ((com.github.catvod.spider.merge.l0.j) obj).h(z);
        }
    }

    /* renamed from: ۟ۤ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.d m8317(Object obj, int i) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).d(i);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m8318(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8319(Object obj) {
        if (C0011.m2755() > 0) {
            return ((XmlResourceParser) obj).getName();
        }
        return null;
    }

    /* renamed from: ۟ۥۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m8320() {
        return (-113) ^ C0056.f841;
    }

    /* renamed from: ۟ۥۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m8321() {
        if (C0038.m6471() > 0) {
            return "调试->getPlayHeaders出错：";
        }
        return null;
    }

    /* renamed from: ۟ۥۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8322(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            ((com.github.catvod.spider.merge.E.h) obj).b((String) obj2);
        }
    }

    /* renamed from: ۟ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static EditText m8323(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((DialogInterfaceOnClickListenerC0257s) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8324() {
        if (C0035.m6140() < 0) {
            return "Referer";
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m8325(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((com.github.catvod.spider.merge.B.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static MenuHostHelper m8326(Object obj) {
        if (C0006.m1726() < 0) {
            return ((C0401e) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8327(Object obj) {
        if (C0011.m2755() > 0) {
            ((com.github.catvod.spider.merge.W.h) obj).e();
        }
    }

    /* renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m8328(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((l0) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8329(Object obj, boolean z) {
        if (C0039.m6529() <= 0) {
            ((Dialog) obj).setCanceledOnTouchOutside(z);
        }
    }

    /* renamed from: ۟ۦۨۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8330(Object obj, int i) {
        if (C0030.m5375() >= 0) {
            return ((GnssStatus) obj).hasEphemerisData(i);
        }
        return false;
    }

    /* renamed from: ۟ۧۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8331() {
        if (C0062.m9429() >= 0) {
            return "人机验证";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m8332(String str) {
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
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static Integer m8333(Object obj, int i) {
        if (C0006.m1726() <= 0) {
            return Integer.valueOf((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8334(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).e((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8335(int i, Object obj) {
        if (C0029.m5282() >= 0) {
            return com.github.catvod.spider.merge.T0.a.a(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m8336(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0051.m8216() <= 0) {
            return ((Tianyi) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۠۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8338(Object obj, Object obj2) {
        if (C0010.m2320() <= 0) {
            ((Window) obj).setAttributes((WindowManager.LayoutParams) obj2);
        }
    }

    /* renamed from: ۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m8339(Object obj) {
        if (C0002.m1242() >= 0) {
            return MYzhiqiu.f((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m8340() {
        if (C0036.m6252() > 0) {
            return ".*手机#";
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8341(Object obj, Object obj2, Object obj3) {
        if (C0019.m4065() < 0) {
            com.github.catvod.spider.merge.l0.j.c((PrintWriter) obj, (String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8342(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((C0281k) obj).e();
        }
        return 0;
    }

    /* renamed from: ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m8343(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.N0.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8344(Object obj) {
        if (C0009.m2047() > 0) {
            return ((n) obj).d;
        }
        return 0;
    }

    /* renamed from: ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m8345(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            ((Paint) obj).setTextAlign((Paint.Align) obj2);
        }
    }

    /* renamed from: ۣۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m8346(Object obj) {
        if (C0053.m8389() >= 0) {
            LockSupport.park(obj);
        }
    }

    /* renamed from: ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8347(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((m) obj).e();
        }
        return null;
    }

    /* renamed from: ۡۤۡ۠, reason: not valid java name and contains not printable characters */
    public static C0268c m8348(Object obj) {
        if (C0019.m4065() < 0) {
            return ((C0268c) obj).c;
        }
        return null;
    }

    /* renamed from: ۡۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8349(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.d.g) obj).h((String) obj2);
        }
    }

    /* renamed from: ۡۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m8350(Object obj, Object obj2, Object obj3) {
        if (C0027.m5017() > 0) {
            return ((C0259u) obj).i((String) obj2, (String[]) obj3);
        }
        return null;
    }

    /* renamed from: ۡۦۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m8351(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((C0333m) obj).b;
        }
        return null;
    }

    /* renamed from: ۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m8352(Object obj, Object obj2, Object obj3) {
        if (C0007.m1886() >= 0) {
            return ((Method) obj).invoke(obj2, (Object[]) obj3);
        }
        return null;
    }

    /* renamed from: ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8353(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.merge.Y0.a) obj).b;
        }
        return false;
    }

    /* renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8354(Object obj) {
        if (C0059.m9257() <= 0) {
            ((C0254o) obj).l();
        }
    }

    /* renamed from: ۢۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Runtime m8355() {
        if (C0022.m4497() >= 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* renamed from: ۢۥۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8356(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.a0.L) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.n m8357() {
        if (C0011.m2755() >= 0) {
            return com.github.catvod.spider.merge.T0.n.e;
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8358(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((HBrenren) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8359(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).e();
        }
        return null;
    }

    /* renamed from: ۣۥۧۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8360(Object obj) {
        if (C0050.m8121() < 0) {
            return ((AccessibilityNodeInfo) obj).getError();
        }
        return null;
    }

    /* renamed from: ۣۦۧ۠, reason: not valid java name and contains not printable characters */
    public static WebSettings.LayoutAlgorithm m8361() {
        if (C0053.m8389() >= 0) {
            return WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        }
        return null;
    }

    /* renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8362(Object obj) {
        if (C0003.m1463() <= 0) {
            Arrays.sort((char[]) obj);
        }
    }

    /* renamed from: ۤۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m8363(Object obj, boolean z) {
        if (C0044.m7508() <= 0) {
            ((com.github.catvod.spider.merge.l0.j) obj).g(z);
        }
    }

    /* renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8364(Object obj, int i) {
        if (C0048.m7971() > 0) {
            return Base64.encodeToString((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8365() {
        if (C0026.m4977() < 0) {
            return "首页";
        }
        return null;
    }

    /* renamed from: ۤۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Executor m8366(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0292c) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8367() {
        if (C0030.m5375() >= 0) {
            return "data:image/png;base64,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";
        }
        return null;
    }

    /* renamed from: ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8368(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0019.m4065() <= 0) {
            return com.github.catvod.spider.merge.B0.a.r((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static W m8369(Object obj) {
        if (C0029.m5282() > 0) {
            return ((V) obj).g;
        }
        return null;
    }

    /* renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static w m8370(Object obj) {
        if (C0043.m7332() >= 0) {
            return w.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static int m8371(Object obj) {
        if (C0035.m6140() < 0) {
            return ((ArrayList) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۥۤۥۣ, reason: contains not printable characters */
    public static String m8372() {
        if (C0058.m9131() <= 0) {
            return "AES";
        }
        return null;
    }

    /* renamed from: ۥۨۥۣ, reason: contains not printable characters */
    public static int m8373(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            return ((ArrayList) obj).indexOf(obj2);
        }
        return 0;
    }

    /* renamed from: ۦ۟ۥۦ, reason: contains not printable characters */
    public static boolean m8374(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((m) obj).O((com.github.catvod.spider.merge.T0.g) obj2);
        }
        return false;
    }

    /* renamed from: ۦ۠ۨۢ, reason: contains not printable characters */
    public static String[] m8375(Object obj) {
        if (C0001.m1164() < 0) {
            return ((SSLSocket) obj).getSupportedCipherSuites();
        }
        return null;
    }

    /* renamed from: ۦۣۦۧ, reason: contains not printable characters */
    public static C0268c m8376(Object obj) {
        if (C0060.m9355() > 0) {
            return ((C0267b) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۤۦۢ, reason: contains not printable characters */
    public static String m8377(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((com.github.catvod.spider.merge.E.b) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static Object m8378(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0246g) obj).k;
        }
        return null;
    }

    /* renamed from: ۦۨۥ, reason: contains not printable characters */
    public static ArrayList m8379(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((WebDAV) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8380(Object obj) {
        if (C0027.m5017() > 0) {
            ((WebView) obj).resumeTimers();
        }
    }

    /* renamed from: ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m8381(Object obj) {
        if (C0056.m8886() <= 0) {
            return com.github.catvod.spider.merge.D.f.G((Map) obj);
        }
        return null;
    }

    /* renamed from: ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8382(Object obj) {
        if (m8320() > 0) {
            return ((InterfaceC0416b) obj).isFinal();
        }
        return false;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Bitmap.Config m8383() {
        if (C0022.m4497() > 0) {
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    /* renamed from: ۨ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.h m8384(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((k) obj).e;
        }
        return null;
    }

    /* renamed from: ۨۦۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8385(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            return ((AbstractCollection) obj).retainAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m8386(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            return ((View) obj).onApplyWindowInsets((WindowInsets) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m8387(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex();
        }
        return 0;
    }

    /* renamed from: ۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m8337(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}