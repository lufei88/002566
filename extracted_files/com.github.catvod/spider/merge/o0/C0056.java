package com.github.catvod.spider.merge.o0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.graphics.Rect;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import androidx.core.util.Consumer;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.HBT4;
import com.github.catvod.spider.Ikanbot;
import com.github.catvod.spider.NCat;
import com.github.catvod.spider.Star;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.V;
import com.github.catvod.spider.merge.F0.f0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M0.f;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0171c;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.k;
import com.github.catvod.spider.merge.U0.A;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0223z;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.P;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.e;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c.C0264a;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0272b;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.RunnableC0327g;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;

/* renamed from: com.github.catvod.spider.merge.o0.۟۟۠ۢ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0056 {

    /* renamed from: ۟ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int f841 = -592;

    /* renamed from: ۟۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static void m8855(Object obj) {
        if (C0002.m1242() > 0) {
            p.j((p) obj);
        }
    }

    /* renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m8856(Object obj, Object obj2, boolean z) {
        if (C0034.m6048() < 0) {
            return ((Star) obj).searchContent((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8857(Object obj) {
        if (C0058.m9131() < 0) {
            return e.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Method[] m8858(Object obj) {
        if (C0007.m1886() > 0) {
            return ((Class) obj).getDeclaredMethods();
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m8859(Object obj) {
        if (C0016.m3596() < 0) {
            return ((HBT4) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8860(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((r) obj).q();
        }
        return false;
    }

    /* renamed from: ۟۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8861() {
        if (C0022.m4497() >= 0) {
            return com.github.catvod.spider.merge.Z.c.c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m8862(Object obj) {
        if (C0041.m6823() < 0) {
            return ((g) obj).b();
        }
        return null;
    }

    /* renamed from: ۟۠۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m8863(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.w0.b) obj).getBoundReceiver();
        }
        return null;
    }

    /* renamed from: ۟۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m8864(Object obj) throws IOException {
        if (C0061.m9359() < 0) {
            ((Reader) obj).close();
        }
    }

    /* renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Charset m8865() {
        if (m8886() <= 0) {
            return C0010.m2298();
        }
        return null;
    }

    /* renamed from: ۟۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m8866(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.E0.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8867(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((ShortcutInfo) obj).getPackage();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.r m8868(int i, int i2) {
        if (C0029.m5282() >= 0) {
            return B.d(i, i2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8869(Object obj) {
        if (C0064.m9659() < 0) {
            return com.github.catvod.spider.p000mergexbpq.x.a.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m8870(Object obj) {
        if (C0011.m2755() > 0) {
            ((ReentrantLock) obj).unlock();
        }
    }

    /* renamed from: ۟ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8871(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((C0174a) obj).m();
        }
        return null;
    }

    /* renamed from: ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static List m8872(Object obj) {
        if (C0017.m3633() < 0) {
            return ((AList) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static WebBackForwardList m8873(Object obj) {
        if (C0005.m1599() < 0) {
            return ((WebView) obj).copyBackForwardList();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8874(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((View) obj).isFocusableInTouchMode();
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8875(Object obj, int i) {
        if (C0028.m5152() <= 0) {
            return ((GnssStatus) obj).usedInFix(i);
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8876(Object obj, Object obj2) {
        if (C0052.m8320() > 0) {
            return ((View) obj).removeCallbacks((Runnable) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8877(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.V.b) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m8878() {
        if (C0046.m7701() > 0) {
            return "    </div>\n\n<div class=\"app-header\">\n        <i class=\"fas fa-tiger fa-2x\"></i>\n        <div class=\"title-group\">\n            <p class=\"subtitle\">主题由老同志制作</p>\n        </div>\n    </div>\n\n    <!-- JavaScript 逻辑 -->\n    <script>\n        // 缓存 DOM 元素\n        const searchInput = document.getElementById('searchInput');\n        const toggleDanmuBtn = document.getElementById('toggleDanmuBtn');\n        const statusMessage = document.getElementById('statusMessage');\n        let danmuPanel = null; // 弹幕面板引用\n        let isPanelVisible = false; // 面板状态\n\n        const focusable = document.querySelectorAll('a[href], button, input, textarea');\n        const focusArray = Array.from(focusable).filter(el => !el.disabled && el.tabIndex !== -1);\n        let currentIndex = 0;\n\n        if (focusArray.length > 0) {\n            focusArray[0].focus();\n        }\n\n        // 搜索处理\n        function handleSearch() {\n            const value = searchInput.value.trim();\n            if (!value) return showStatus('请输入搜索内容', 'failure');\n            const paramName = searchInput.getAttribute('name');\n            const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۢۦۢۦ, reason: not valid java name and contains not printable characters */
    public static C0264a m8879() {
        if (C0019.m4065() <= 0) {
            return C0264a.b;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۠۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m8880(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((com.github.catvod.spider.merge.E0.p) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8881(Object obj) {
        if (C0021.m4379() > 0) {
            ((C0246g) obj).m();
        }
    }

    /* renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Consumer m8882(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.q.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8883() {
        if (C0002.m1242() >= 0) {
            return "获取筛选错误！-->";
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static m m8884(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            return Ali.a((Matcher) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static void m8885(Object obj) {
        if (C0060.m9355() >= 0) {
            ((q) obj).g();
        }
    }

    /* renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8886() {
        return 146 ^ C0047.f763;
    }

    /* renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Parcel m8887(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۥۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8888(Object obj, float f) {
        if (C0033.m5872() > 0) {
            return C0302e.d((Context) obj, f);
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8889(int i) {
        if (C0011.m2755() >= 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8890(Object obj, int i) {
        if (C0029.m5282() >= 0) {
            return ((String) obj).substring(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8891(Object obj) {
        if (C0042.m7147() <= 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static ComponentName m8892(Object obj) {
        if (C0061.m9359() < 0) {
            return ((ShortcutInfo) obj).getActivity();
        }
        return null;
    }

    /* renamed from: ۟ۦۡۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.c m8893(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((l) obj).d();
        }
        return null;
    }

    /* renamed from: ۟ۦۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8894(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).D;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m8895(Object obj) throws IOException {
        if (C0052.m8320() >= 0) {
            ((BufferedWriter) obj).newLine();
        }
    }

    /* renamed from: ۟ۦۧۦۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8896(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8897(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            return C0271a.j((Set) obj, obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m8898() {
        if (C0049.m8038() < 0) {
            return ".*";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m8899() {
        if (C0054.m8557() <= 0) {
            return NCat.a();
        }
        return null;
    }

    /* renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8900(Object obj) {
        if (C0044.m7508() < 0) {
            return ((V) obj).h;
        }
        return false;
    }

    /* renamed from: ۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m8901(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() > 0) {
            ((Cloud) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m8902(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((Star) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8903(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.G.e) obj).a();
        }
        return null;
    }

    /* renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8904(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static C0272b m8905(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m8906(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((k) obj).c();
        }
        return null;
    }

    /* renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m8907(Object obj, Object obj2, Object obj3) {
        if (C0001.m1164() < 0) {
            return ((C0163u) obj).d(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۡۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m8908() {
        if (C0048.m7971() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        return null;
    }

    /* renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8909(Object obj) {
        if (C0030.m5375() >= 0) {
            return URLEncoder.encode((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m8910(Object obj) {
        if (C0023.m4566() < 0) {
            return ((C0267b) obj).next();
        }
        return null;
    }

    /* renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m8912() {
        if (C0002.m1242() >= 0) {
            return WindowInsets.Type.tappableElement();
        }
        return 0;
    }

    /* renamed from: ۢ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8913(Object obj) {
        if (C0035.m6140() < 0) {
            ((com.github.catvod.spider.merge.M.g) obj).e();
        }
    }

    /* renamed from: ۢ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String[] m8914() {
        if (C0029.m5282() > 0) {
            return A.A;
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8915(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        if (C0024.m4693() <= 0) {
            Gravity.apply(i, i2, i3, (Rect) obj, (Rect) obj2, i4);
        }
    }

    /* renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8916() {
        if (C0036.m6252() >= 0) {
            return "分类url";
        }
        return null;
    }

    /* renamed from: ۢۡۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8917(Object obj) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.merge.E.g.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m8918(Object obj, Object obj2) {
        if (m8886() <= 0) {
            ((AccessibilityNodeInfo) obj).setTraversalBefore((View) obj2);
        }
    }

    /* renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static ShortcutInfo.Builder m8919(Object obj, boolean z) {
        if (m8886() <= 0) {
            return ((ShortcutInfo.Builder) obj).setLongLived(z);
        }
        return null;
    }

    /* renamed from: ۢۧۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8920(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0016.m3596() < 0) {
            ((C0254o) obj).f((String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8921() {
        if (C0027.m5017() >= 0) {
            return "]";
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8922(Object obj, Object obj2, int i) {
        if (C0053.m8389() > 0) {
            ((Parcelable) obj).writeToParcel((Parcel) obj2, i);
        }
    }

    /* renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8923(Object obj) {
        if (C0047.m7837() > 0) {
            ((com.github.catvod.spider.merge.T0.r) obj).u();
        }
    }

    /* renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m8924(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.E.l) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m8925(Object obj, Object obj2, Object obj3) {
        if (C0051.m8216() < 0) {
            return ((Ikanbot) obj).get_tks((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8926(Object obj, Object obj2) {
        if (C0026.m4977() < 0) {
            return Uri.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static Exception m8927(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((RunnableC0327g) obj).c;
        }
        return null;
    }

    /* renamed from: ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m8928() {
        if (C0055.m8740() >= 0) {
            return "主演";
        }
        return null;
    }

    /* renamed from: ۤۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8929(Object obj) {
        if (m8886() <= 0) {
            return ((ViewGroup.LayoutParams) obj).width;
        }
        return 0;
    }

    /* renamed from: ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8930(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0145b) obj).b();
        }
        return false;
    }

    /* renamed from: ۣۤ, reason: not valid java name and contains not printable characters */
    public static Double m8931(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).f;
        }
        return null;
    }

    /* renamed from: ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.c m8932(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).d((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m8933(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((Symx) obj).a();
        }
        return null;
    }

    /* renamed from: ۥ۟ۧۡ, reason: contains not printable characters */
    public static HorizontalScrollView m8934(Object obj) {
        if (C0001.m1164() < 0) {
            return ((C0340u) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۧ۠ۡ, reason: contains not printable characters */
    public static boolean m8935() {
        if (C0060.m9355() > 0) {
            return AbstractC0296g.d;
        }
        return false;
    }

    /* renamed from: ۦۤۧۢ, reason: contains not printable characters */
    public static void m8936(Object obj) {
        if (C0007.m1886() >= 0) {
            ((C0254o) obj).b();
        }
    }

    /* renamed from: ۦۦ۟ۦ, reason: contains not printable characters */
    public static View m8937(Object obj) {
        if (C0041.m6823() < 0) {
            return com.github.catvod.spider.merge.a1.l.e((View) obj);
        }
        return null;
    }

    /* renamed from: ۦۧۨۢ, reason: contains not printable characters */
    public static String m8938(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m8939(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((P) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۡۧ۠, reason: not valid java name and contains not printable characters */
    public static C0171c m8940(Object obj) {
        if (C0060.m9355() >= 0) {
            return C0171c.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m8941() {
        if (C0000.m1116() < 0) {
            return "<style[. ]*?>[. ]*?</style>";
        }
        return null;
    }

    /* renamed from: ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8942() {
        if (C0008.m1975() >= 0) {
            return "xpDetailContent()错误！-->";
        }
        return null;
    }

    /* renamed from: ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8943(Object obj, int i) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).g(i);
        }
        return false;
    }

    /* renamed from: ۧۧۧۢ, reason: not valid java name and contains not printable characters */
    public static Q m8944(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((f0) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8945(Object obj) {
        if (C0055.m8740() > 0) {
            return ((C0254o) obj).h;
        }
        return false;
    }

    /* renamed from: ۣۨۢۥ, reason: not valid java name and contains not printable characters */
    public static void m8946(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            C0024.m4733(obj, (f) obj2);
        }
    }

    /* renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8947(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((C0174a) obj).c;
        }
        return 0;
    }

    /* renamed from: ۨۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m8948(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() <= 0) {
            return ((WeakHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۨۦۨ۟, reason: not valid java name and contains not printable characters */
    public static C0223z m8949() {
        if (C0018.m3956() > 0) {
            return com.github.catvod.spider.merge.U0.B.i;
        }
        return null;
    }

    /* renamed from: ۡۦۧۤ, reason: not valid java name and contains not printable characters */
    public static String m8911(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}