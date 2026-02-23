package com.github.catvod.spider.p000mergexbpq.a0;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.HorizontalScrollView;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.HBtdou;
import com.github.catvod.spider.HBxingC;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.NCat;
import com.github.catvod.spider.Test;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F0.A;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.N0.b;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U0.I;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.c;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.J;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.ViewOnClickListenerC0260v;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.h0.RunnableC0317F;
import com.github.catvod.spider.merge.i.C0343c;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.n;
import com.github.catvod.spider.p000mergexbpq.d.f;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.N;
import com.github.catvod.spider.p000mergexbpq.e0.O;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: com.github.catvod.spider.merge-xbpq.a0.ۣۡۧۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0007 {

    /* renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f171 = -160;

    /* renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m1802(Object obj, int i) {
        if (C0062.m9429() >= 0) {
            return ((JSONArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static d m1803(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() > 0) {
            return c.b((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1804(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0343c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1805(Object obj, Object obj2, Object obj3) {
        if (C0059.m9257() < 0) {
            return ((N) obj).a((l) obj2, (l) obj3);
        }
        return false;
    }

    /* renamed from: ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static f m1806(Object obj) {
        if (C0038.m6471() >= 0) {
            return f.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String[] m1807(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((v) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1808(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((b) obj).b;
        }
        return false;
    }

    /* renamed from: ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1809(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return e.b((String) obj, (HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static HorizontalScrollView m1810(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((C0335o) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Logger m1811(Object obj) {
        if (C0053.m8389() >= 0) {
            return Logger.getLogger((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1812(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1813(Object obj, Object obj2) {
        if (m1886() > 0) {
            return com.github.catvod.spider.merge.D.f.l((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1814(Object obj) {
        if (C0033.m5872() >= 0) {
            ((CountDownLatch) obj).countDown();
        }
    }

    /* renamed from: ۟ۡۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1815(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1816(Object obj) {
        if (C0023.m4566() <= 0) {
            ((Dialog) obj).show();
        }
    }

    /* renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1817(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟ۡۥۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1818(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((RunnableC0317F) obj).d;
        }
        return false;
    }

    /* renamed from: ۟ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1819(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.U0.N) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m1820(Object obj) {
        if (C0016.m3596() < 0) {
            return ((WindowInsets) obj).getDisplayCutout();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1821(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((StackTraceElement) obj).getMethodName();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1822(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.f) obj).j;
        }
        return false;
    }

    /* renamed from: ۣ۟ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static char m1823(Object obj, int i) {
        if (C0058.m9131() <= 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* renamed from: ۟ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m1824() {
        if (C0039.m6529() <= 0) {
            return ".*_UA#";
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1825(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if (C0043.m7332() > 0) {
            return ((L) obj).k((com.github.catvod.spider.merge.G0.b) obj2, (com.github.catvod.spider.merge.G0.d) obj3, (com.github.catvod.spider.merge.E0.f) obj4, i, (p) obj5);
        }
        return 0;
    }

    /* renamed from: ۟ۤۢۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1826(Object obj) {
        if (C0022.m4497() > 0) {
            return n.e((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۢۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1827() {
        if (C0023.m4566() < 0) {
            return "webparse/";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1828(Object obj) {
        if (C0014.m3353() < 0) {
            return ((HBqwKan) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1829(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((ParsePosition) obj).getIndex();
        }
        return 0;
    }

    /* renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1830(Object obj) {
        if (C0006.m1726() < 0) {
            return ((HBNT4) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m1831(Object obj) {
        if (C0059.m9257() < 0) {
            return ((i) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1832(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۥۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1833() {
        if (C0044.m7508() <= 0) {
            return "fetchPost()错误-->";
        }
        return null;
    }

    /* renamed from: ۟ۥۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1834(Object obj) {
        if (C0032.m5686() < 0) {
            return ((HBxingC) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1835(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((C0166x) obj).f;
        }
        return 0;
    }

    /* renamed from: ۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1836(Object obj) {
        if (C0061.m9359() < 0) {
            return ((a) obj).g0;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۤ۟, reason: not valid java name and contains not printable characters */
    public static I m1837(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((P) obj).m;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢ۟, reason: not valid java name and contains not printable characters */
    public static A[] m1838() {
        if (C0012.m3024() > 0) {
            return A.values();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1839(Object obj, boolean z) {
        if (C0049.m8038() <= 0) {
            ((URLConnection) obj).setDoOutput(z);
        }
    }

    /* renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1840() {
        if (C0037.m6350() < 0) {
            return "";
        }
        return null;
    }

    /* renamed from: ۟ۦۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1841() {
        if (C0024.m4693() <= 0) {
            return "btwaf=&&\"";
        }
        return null;
    }

    /* renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1843(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            return C0150g.d((UUID) obj, (UUID) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Comparator m1844() {
        if (C0017.m3633() <= 0) {
            return C0043.m7331();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1845(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).l();
        }
        return null;
    }

    /* renamed from: ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m1846(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return ((StaticLayout.Builder) obj).setTextDirection((TextDirectionHeuristic) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1847(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((Thread) obj).isInterrupted();
        }
        return false;
    }

    /* renamed from: ۠۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1848(Object obj) {
        if (C0048.m7971() > 0) {
            return ((o) obj).j;
        }
        return false;
    }

    /* renamed from: ۠ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1849() {
        if (C0022.m4497() > 0) {
            return ".*(\\[仅?替换[:：][^\\]]+?\\]).*";
        }
        return null;
    }

    /* renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1850(Object obj, Object obj2, int i, Object obj3) {
        if (C0060.m9355() > 0) {
            ((r) obj).r((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1851() {
        if (C0062.m9429() >= 0) {
            return "{";
        }
        return null;
    }

    /* renamed from: ۠ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m1852(Object obj) {
        if (C0048.m7971() > 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* renamed from: ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static List m1853(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0026.m4977() <= 0) {
            return ((M) obj).s((j) obj2, (ArrayList) obj3, (ArrayList) obj4, (String) obj5, (String) obj6, (Integer) obj7);
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1854() {
        if (C0010.m2320() <= 0) {
            return "\\d";
        }
        return null;
    }

    /* renamed from: ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m1855(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.N.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۢ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.d m1856(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.merge.T0.p) obj).j;
        }
        return null;
    }

    /* renamed from: ۢ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1857(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((HBtdou) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m1858() {
        if (C0002.m1242() > 0) {
            return Test.a();
        }
        return null;
    }

    /* renamed from: ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1859(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Market) obj).c;
        }
        return false;
    }

    /* renamed from: ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1860(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            ((Animation) obj).setAnimationListener((Animation.AnimationListener) obj2);
        }
    }

    /* renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1861(Object obj) {
        if (C0005.m1599() < 0) {
            return ((s) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m1862(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((CharBuffer) obj).put((CharBuffer) obj2);
        }
        return null;
    }

    /* renamed from: ۣۡۥۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m1863(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1864(Object obj) {
        if (C0047.m7837() > 0) {
            return ((C0271a) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Intent m1865(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() <= 0) {
            return ((Intent) obj).setDataAndType((Uri) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1866(Object obj, Object obj2) {
        if (C0052.m8320() > 0) {
            return ((ArrayList) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static StaticLoggerBinder m1867() {
        if (C0039.m6529() <= 0) {
            return StaticLoggerBinder.getSingleton();
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1868() {
        if (C0058.m9131() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        return null;
    }

    /* renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1869(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.f) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m1870(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static void m1871(Object obj, Object obj2) {
        if (C0016.m3596() <= 0) {
            com.github.catvod.spider.p000mergexbpq.W.a.c((O) obj, (com.github.catvod.spider.p000mergexbpq.c0.r) obj2);
        }
    }

    /* renamed from: ۥۡۨۦ, reason: contains not printable characters */
    public static r m1872(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((m) obj).w();
        }
        return null;
    }

    /* renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static String m1873(Object obj, Object obj2, Object obj3) {
        if (C0043.m7332() >= 0) {
            return ((NCat) obj).decryptUrl((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦ۟۠ۦ, reason: contains not printable characters */
    public static boolean m1874(Object obj) {
        if (C0050.m8121() < 0) {
            return ((Inflater) obj).finished();
        }
        return false;
    }

    /* renamed from: ۦۣۡ۠, reason: contains not printable characters */
    public static Date m1875(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((DateFormat) obj).parse((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦۡۢۧ, reason: contains not printable characters */
    public static void m1876(Object obj, Object obj2) {
        if (m1886() > 0) {
            e.y(obj, (String) obj2);
        }
    }

    /* renamed from: ۦۣۡ۠, reason: contains not printable characters */
    public static int m1877(Object obj, int i) {
        if (C0046.m7701() > 0) {
            return ((PrecomputedText) obj).getParagraphEnd(i);
        }
        return 0;
    }

    /* renamed from: ۦۨۦۡ, reason: contains not printable characters */
    public static void m1878(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            ((b) obj).e((StringBuffer) obj2, (Map) obj3);
        }
    }

    /* renamed from: ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1879(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((w) obj).r();
        }
        return 0;
    }

    /* renamed from: ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1880(Object obj) {
        if (C0054.m8557() < 0) {
            return ((com.github.catvod.spider.merge.W.l) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static PersistableBundle m1881(Object obj, Object obj2) {
        if (C0056.m8886() <= 0) {
            return ((PersistableBundle) obj).getPersistableBundle((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۡۥۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1882(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.K0.a.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m1883(Object obj) {
        if (C0049.m8038() < 0) {
            return Arrays.toString((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۦۡ, reason: not valid java name and contains not printable characters */
    public static void m1884(Object obj) throws IOException {
        if (C0046.m7701() > 0) {
            ((GZIPOutputStream) obj).finish();
        }
    }

    /* renamed from: ۣۧۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1885(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((ShortcutManager) obj).addDynamicShortcuts((List) obj2);
        }
        return false;
    }

    /* renamed from: ۧۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1886() {
        return 13 ^ C0022.f465;
    }

    /* renamed from: ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1887(Object obj) {
        if (C0060.m9355() > 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).p();
        }
        return false;
    }

    /* renamed from: ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1888() {
        if (C0026.m4977() < 0) {
            return "\" tabindex=\"0\" />\n                </div>\n                <div class=\"danmu-btn-container\">\n                <button id=\"sendDanmuBtn\" tabindex=\"0\">发送弹幕</button>\n                </div>\n          `;            \n            // 添加到DOM中，放在搜索容器下方\n            const searchContainer = document.querySelector('.search-container');\n            searchContainer.parentNode.insertBefore(danmuPanel, searchContainer.nextSibling);\n            \n            // 获取面板内元素引用\n            const danmuMessage = document.getElementById('danmuMessage');\n            const danmuUsername = document.getElementById('danmuUsername');\n            const sendDanmuBtn = document.getElementById('sendDanmuBtn');\n            \n            // 绑定发送事件\n            sendDanmuBtn.addEventListener('click', () => sendDanmu(danmuUsername, danmuMessage));\n            \n            // 绑定Enter发送事件\n            danmuMessage.addEventListener('keydown', e => {\n                if (e.key === 'Enter' && !e.shiftKey) {\n                    e.preventDefault();\n                    sendDanmu(danmuUsername, danmuMessage);\n                }\n            });\n            \n            // 更新可聚焦元素列表\n            updateFocusableElements();\n            \n            // 设置焦点到文本框\n            setTimeout(() => danmuMessage.focus(), 100);\n        }\n        \n        // 发送弹幕\n        function sendDanmu(usernameEl, messageEl) {\n            const username = usernameEl.value.trim();\n            const message = messageEl.value.trim();\n            \n            if (!username) return showStatus('请输入昵称', 'failure');\n            if (!message) return showStatus('请输入弹幕内容', 'failure');\n            if (message.length > 50) return showStatus('弹幕内容过长（≤50字）', 'failure');\n\n            const url = `";
        }
        return null;
    }

    /* renamed from: ۧۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1889(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.S.j) obj).e();
        }
        return 0;
    }

    /* renamed from: ۧۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1890(Object obj) {
        if (C0057.m9017() > 0) {
            return ((J) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m1891(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((ViewOnClickListenerC0260v) obj).c;
        }
        return null;
    }

    /* renamed from: ۨ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1892(Object obj, char c) {
        if (C0063.m9589() < 0) {
            return Arrays.binarySearch((char[]) obj, c);
        }
        return 0;
    }

    /* renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static long m1893(Object obj) {
        if (C0017.m3633() < 0) {
            return ((Date) obj).getTime();
        }
        return 0L;
    }

    /* renamed from: ۨۥۣۦ, reason: not valid java name and contains not printable characters */
    public static Q m1894(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.h0.M) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Throwable m1895(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.i1.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1896(int i) {
        if (C0018.m3956() >= 0) {
            return Character.charCount(i);
        }
        return 0;
    }

    /* renamed from: ۨۨۦۣ, reason: not valid java name and contains not printable characters */
    public static Insets m1897(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((WindowInsetsAnimationController) obj).getShownStateInsets();
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1842(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}