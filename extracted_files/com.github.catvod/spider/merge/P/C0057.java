package com.github.catvod.spider.merge.p;

import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.graphics.Paint;
import android.graphics.Region;
import android.os.Handler;
import android.util.SparseLongArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBgetapp;
import com.github.catvod.spider.HBlive;
import com.github.catvod.spider.HBmengya;
import com.github.catvod.spider.HBrren;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.c;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0154k;
import com.github.catvod.spider.merge.F0.C0155l;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.T;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.w;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.k;
import com.github.catvod.spider.merge.T0.q;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.l;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.j;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e0.AbstractC0287f;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e1.b;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.n0.AbstractC0356b;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.B;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.p.ۣ۠ۡۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0057 {

    /* renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f842 = -456;

    /* renamed from: ۟۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static Appendable m8950(Object obj, char c) {
        if (C0021.m4379() >= 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* renamed from: ۟۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8951(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((P) obj).j((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static Locale m8952() {
        if (C0054.m8557() < 0) {
            return Locale.ENGLISH;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8953(Object obj) {
        if (C0046.m7701() > 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8954(Object obj) {
        if (C0060.m9355() > 0) {
            return ((D) obj).a();
        }
        return 0;
    }

    /* renamed from: ۟۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static WebHistoryItem m8955(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((WebBackForwardList) obj).getCurrentItem();
        }
        return null;
    }

    /* renamed from: ۟۠ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m8956(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((HBmengya) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8957(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((b) obj).e();
        }
        return false;
    }

    /* renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static HashMap m8958(Object obj) {
        if (C0029.m5282() > 0) {
            return ((M) obj).f;
        }
        return null;
    }

    /* renamed from: ۟۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static e m8959(Object obj) {
        if (C0030.m5375() > 0) {
            return e.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m8960(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            ((View) obj).setOnFocusChangeListener((View.OnFocusChangeListener) obj2);
        }
    }

    /* renamed from: ۟۠ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m8961(Object obj) throws IOException {
        if (C0028.m5152() < 0) {
            ((BufferedReader) obj).close();
        }
    }

    /* renamed from: ۟۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8962() {
        if (C0033.m5872() >= 0) {
            return com.github.catvod.spider.merge.N0.b.q;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m8963() {
        if (C0008.m1975() > 0) {
            return i.i;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8964(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            ((AccessibilityNodeInfo) obj).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj2);
        }
    }

    /* renamed from: ۟ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8965(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return com.github.catvod.spider.merge.S0.b.f((String) obj, (ArrayList) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8966() {
        if (C0049.m8038() <= 0) {
            return AbstractC0356b.a;
        }
        return false;
    }

    /* renamed from: ۟ۡۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8967(Object obj) {
        if (C0045.m7538() < 0) {
            return ((TimeZone) obj).getID();
        }
        return null;
    }

    /* renamed from: ۟ۡۦۤۨ, reason: not valid java name and contains not printable characters */
    public static String m8968(Object obj) {
        if (C0045.m7538() < 0) {
            return MYzhiqiu.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m8969(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((g) obj).f;
        }
        return 0;
    }

    /* renamed from: ۟ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Method m8970(Object obj, Object obj2, Object obj3) {
        if (C0023.m4566() <= 0) {
            return ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۨۦۣ, reason: not valid java name and contains not printable characters */
    public static Collection m8971(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((T) obj).values();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static void m8972(Object obj) {
        if (C0039.m6529() < 0) {
            ((C0273c) obj).clear();
        }
    }

    /* renamed from: ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8973(String str) {
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

    /* renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m8974(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Class m8975(Object obj, boolean z, Object obj2) {
        if (C0016.m3596() < 0) {
            return Class.forName((String) obj, z, (ClassLoader) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8976() {
        if (C0000.m1116() <= 0) {
            return "dtUrlName";
        }
        return null;
    }

    /* renamed from: ۟ۢۧۦۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8977(Object obj, Object obj2, int i, int i2) {
        if (C0058.m9131() < 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2, i, i2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m8979(Object obj) {
        if (C0029.m5282() >= 0) {
            ((com.github.catvod.spider.merge.G.a) obj).a();
        }
    }

    /* renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8980(Object obj) {
        if (C0036.m6252() >= 0) {
            return String.valueOf((char[]) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8981() {
        if (C0032.m5686() <= 0) {
            return AbstractC0287f.b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static void m8982(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            com.github.catvod.spider.merge.w0.g.d(obj, (String) obj2);
        }
    }

    /* renamed from: ۣ۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static r m8983(Object obj) {
        if (C0058.m9131() < 0) {
            return ((r) obj).A();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static char m8984(Object obj, int i) {
        if (C0024.m4693() <= 0) {
            return ((StringBuilder) obj).charAt(i);
        }
        return (char) 0;
    }

    /* renamed from: ۟ۤۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m8985(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.h.b.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m8986(Object obj) {
        if (C0053.m8389() > 0) {
            return ((HBrren) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Map m8987(Object obj, int i, int i2, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((Calendar) obj).getDisplayNames(i, i2, (Locale) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8988() {
        if (C0061.m9359() <= 0) {
            return S.g();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m8989(Object obj) {
        if (C0025.m4797() > 0) {
            return ((AList) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.T.b m8990(Object obj, int i) {
        if (C0046.m7701() >= 0) {
            return ((C) obj).b(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m8991(Object obj, int i, int i2) {
        if (C0045.m7538() <= 0) {
            return ((BigDecimal) obj).setScale(i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۥۦۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8992(Object obj) {
        if (C0018.m3956() > 0) {
            return ((TimeZone) obj).getRawOffset();
        }
        return 0;
    }

    /* renamed from: ۟ۦ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m8993(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return com.github.catvod.spider.merge.g0.e.x((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m8994(Object obj, Object obj2, int i) {
        if (C0016.m3596() <= 0) {
            ((k) obj).d((View) obj2, i);
        }
    }

    /* renamed from: ۟ۦ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8995(Object obj, Object obj2, int i) {
        if (C0000.m1116() < 0) {
            return ((C0166x) obj).g((c) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۟ۦ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m8996(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.F0.C) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۦۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8997(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((HBgetapp) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.Q.a m8998(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((B) obj).f();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۦ۟, reason: not valid java name and contains not printable characters */
    public static ShortcutInfo.Builder m8999(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            return ((ShortcutInfo.Builder) obj).setLocusId((LocusId) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧۢ, reason: not valid java name and contains not printable characters */
    public static Paint.Style m9000() {
        if (C0021.m4379() > 0) {
            return Paint.Style.STROKE;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9001(Object obj, char c) {
        if (C0014.m3353() <= 0) {
            ((p) obj).a(c);
        }
    }

    /* renamed from: ۟ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m9002(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((n) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static Boolean m9003() {
        if (C0003.m1463() < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Region m9004(Object obj, int i) {
        if (C0035.m6140() <= 0) {
            return ((AccessibilityNodeInfo.TouchDelegateInfo) obj).getRegionAt(i);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9005(Object obj) {
        if (C0022.m4497() > 0) {
            ((C0253n) obj).f();
        }
    }

    /* renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9006(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((Bili) obj).c;
        }
        return false;
    }

    /* renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m9007(Object obj) {
        if (C0002.m1242() > 0) {
            return ((HBrren) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m9008(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).w;
        }
        return null;
    }

    /* renamed from: ۡ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m9009() {
        if (C0029.m5282() > 0) {
            return com.github.catvod.spider.merge.S0.b.c;
        }
        return null;
    }

    /* renamed from: ۣۡ, reason: not valid java name and contains not printable characters */
    public static String m9010(Object obj, int i) {
        if (C0048.m7971() >= 0) {
            return ((HBsuipian) obj).convert_minutes(i);
        }
        return null;
    }

    /* renamed from: ۡۥۢۥ, reason: not valid java name and contains not printable characters */
    public static void m9011(Object obj) {
        if (C0001.m1164() <= 0) {
            ((W) obj).n();
        }
    }

    /* renamed from: ۡۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m9012(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((x) obj).i;
        }
        return null;
    }

    /* renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9013(Object obj) {
        if (C0061.m9359() < 0) {
            return HBNT4.b((h) obj);
        }
        return null;
    }

    /* renamed from: ۢ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9014(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginEnd();
        }
        return 0;
    }

    /* renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m9015(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((FishHxq) obj).e((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionInfo m9016(int i, int i2, boolean z, int i3) {
        if (C0032.m5686() <= 0) {
            return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3);
        }
        return null;
    }

    /* renamed from: ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9017() {
        return (-212) ^ C0064.f874;
    }

    /* renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9018(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            return HBlive.g((StringBuilder) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.b m9019(Object obj) {
        if (C0046.m7701() > 0) {
            return ((L) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m9020(Object obj, int i) {
        if (C0039.m6529() <= 0) {
            ((com.github.catvod.spider.merge.T0.r) obj).t(i);
        }
    }

    /* renamed from: ۣۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9021(Object obj) {
        if (C0064.m9659() < 0) {
            return ((d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۦۧ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m9022(Object obj) {
        if (C0049.m8038() < 0) {
            return ((Q) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m9023(Object obj) {
        if (C0060.m9355() > 0) {
            return MYzhiqiu.c((ArrayList) obj);
        }
        return null;
    }

    /* renamed from: ۤ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m9024(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((AccessibilityNodeInfo) obj).getTraversalAfter();
        }
        return null;
    }

    /* renamed from: ۤۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m9025(Object obj, boolean z) {
        if (C0033.m5872() >= 0) {
            ((WebSettings) obj).setBuiltInZoomControls(z);
        }
    }

    /* renamed from: ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m9026(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((C0154k) obj).c;
        }
        return 0;
    }

    /* renamed from: ۥۣ۟ۥ, reason: contains not printable characters */
    public static Handler m9027(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0288g) obj).i;
        }
        return null;
    }

    /* renamed from: ۥۡۥ۟, reason: contains not printable characters */
    public static String m9028() {
        if (C0031.m5628() > 0) {
            return S.h();
        }
        return null;
    }

    /* renamed from: ۥۡۥۡ, reason: contains not printable characters */
    public static void m9029(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            ((com.github.catvod.spider.merge.E.g) obj).d((HashMap) obj2);
        }
    }

    /* renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static String m9030() {
        if (C0053.m8389() >= 0) {
            return "xp(http.*)";
        }
        return null;
    }

    /* renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static long m9031(Object obj, int i, long j) {
        if (C0019.m4065() <= 0) {
            return ((SparseLongArray) obj).get(i, j);
        }
        return 0L;
    }

    /* renamed from: ۥۤۧۡ, reason: contains not printable characters */
    public static String m9032(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.g0.g.k((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static Pattern m9033() {
        if (C0001.m1164() <= 0) {
            return com.github.catvod.spider.merge.S0.b.b;
        }
        return null;
    }

    /* renamed from: ۥۧ۟۟, reason: contains not printable characters */
    public static boolean m9034(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static int m9035(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((TextView) obj).getGravity();
        }
        return 0;
    }

    /* renamed from: ۦۦۧۥ, reason: contains not printable characters */
    public static String m9036(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return j.b((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9037(Object obj, Object obj2) {
        if (C0019.m4065() <= 0) {
            ((C0166x) obj).e((c) obj2);
        }
    }

    /* renamed from: ۧۨۦۥ, reason: not valid java name and contains not printable characters */
    public static int m9038(Object obj) {
        if (C0062.m9429() > 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m9039(Object obj) {
        if (C0060.m9355() >= 0) {
            return l.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static InputStream m9040(Object obj) {
        if (C0056.m8886() < 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* renamed from: ۨۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9041(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            ((com.github.catvod.spider.merge.B.l) obj).e((com.github.catvod.spider.merge.B.h) obj2);
        }
    }

    /* renamed from: ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m9042() {
        if (C0002.m1242() >= 0) {
            return "选线";
        }
        return null;
    }

    /* renamed from: ۨۢۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9043(Object obj, Object obj2) {
        if (C0044.m7508() < 0) {
            return ((C0155l) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۨۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m9044(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((q) obj).d();
        }
        return null;
    }

    /* renamed from: ۨۧۧۢ, reason: not valid java name and contains not printable characters */
    public static TimeZone m9045(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((w) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m8978(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}