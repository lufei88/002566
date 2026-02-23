package com.github.catvod.spider.p000mergexbpq.c0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.os.IBinder;
import android.os.Parcel;
import android.text.StaticLayout;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Douban;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBPguo;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBfling;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Tianyi;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.E0.m;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.F.o;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G.c;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.P0.j;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.t;
import com.github.catvod.spider.merge.P0.v;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.i;
import com.github.catvod.spider.merge.W.k;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.r;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.RunnableC0247h;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.b;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0272b;
import com.github.catvod.spider.merge.e0.AbstractC0287f;
import com.github.catvod.spider.merge.e1.d;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.T.g;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.ref.Reference;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge-xbpq.c0.ۥۣۡ۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0010 {

    /* renamed from: ۟ۥۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f195 = 374;

    /* renamed from: ۟۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2278(Object obj, Object obj2, int i) {
        if (C0030.m5375() > 0) {
            return ((Tianyi) obj).detailContentVodPlayFrom((List) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2279(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C0148e) obj).h;
        }
        return false;
    }

    /* renamed from: ۟۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2280(Object obj) {
        if (C0052.m8320() > 0) {
            return ((a) obj).s;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static D m2281() {
        if (C0003.m1463() <= 0) {
            return D.d;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2282(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((k) obj).b;
        }
        return false;
    }

    /* renamed from: ۟۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2283(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() < 0) {
            ((t) obj).a((StringBuilder) obj2, (Calendar) obj3);
        }
    }

    /* renamed from: ۟۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2284(Object obj, boolean z) {
        if (C0011.m2755() > 0) {
            ((View) obj).setHorizontalScrollBarEnabled(z);
        }
    }

    /* renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m2285() {
        if (C0048.m7971() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String[] m2286(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((v) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m2287(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((DateFormatSymbols) obj).getShortWeekdays();
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2288() {
        if (C0043.m7332() > 0) {
            return "searchUrl";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m2289(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((C0254o) obj).g;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.t m2290(Object obj) {
        if (C0005.m1599() < 0) {
            return ((r) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2291(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((RunnableC0247h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static m m2292(Object obj, int i, Object obj2, Object obj3) {
        if (C0046.m7701() >= 0) {
            return ((L) obj).o(i, (f) obj2, (p) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.D m2293(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((g) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2294(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((CharsetEncoder) obj).canEncode((CharSequence) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2295(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((HBCupfox) obj).e((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2296(Object obj) {
        if (C0046.m7701() >= 0) {
            com.github.catvod.spider.merge.W.v.b((WebView) obj);
        }
    }

    /* renamed from: ۟ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2297(String str) {
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

    /* renamed from: ۟ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Charset m2298() {
        if (C0062.m9429() >= 0) {
            return StandardCharsets.US_ASCII;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static Insets m2299(Object obj) {
        if (C0000.m1116() < 0) {
            return ((WindowInsets) obj).getTappableElementInsets();
        }
        return null;
    }

    /* renamed from: ۟ۢۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m2301(Object obj) {
        if (C0053.m8389() > 0) {
            com.github.catvod.spider.merge.w0.g.b(obj);
        }
    }

    /* renamed from: ۟ۢۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2302() {
        if (C0020.m4210() < 0) {
            return "IV";
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m2303() {
        if (C0053.m8389() > 0) {
            return "|";
        }
        return null;
    }

    /* renamed from: ۟ۢۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Level m2304() {
        if (C0035.m6140() < 0) {
            return Level.SEVERE;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2305(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        if (C0015.m3433() > 0) {
            return ((j) obj).b((n) obj2, (Calendar) obj3, (String) obj4, (ParsePosition) obj5, i);
        }
        return false;
    }

    /* renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m2306() {
        if (C0049.m8038() <= 0) {
            return com.github.catvod.spider.merge.D.f.z();
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m2307(Object obj) {
        if (C0055.m8740() > 0) {
            return ((C0176b) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static Map m2308(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((NG.PlayRst) obj).getHeader();
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static C0272b m2309(Object obj) {
        if (C0020.m4210() < 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2310(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            return ((Set) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2311(Object obj, int i) {
        if (C0061.m9359() <= 0) {
            ((Parcel) obj).setDataPosition(i);
        }
    }

    /* renamed from: ۟ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2312() {
        if (C0052.m8320() > 0) {
            return "调试->播放链接成功跳转";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m2313(Object obj) {
        if (C0040.m6582() > 0) {
            return ((i) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static List m2314(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((NG.VtInfo) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2315(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            ((l) obj).m((HttpURLConnection) obj2);
        }
    }

    /* renamed from: ۟ۤۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2316(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            ((DateFormat) obj).setTimeZone((TimeZone) obj2);
        }
    }

    /* renamed from: ۟ۤۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m2317() {
        if (C0035.m6140() < 0) {
            return "中";
        }
        return null;
    }

    /* renamed from: ۟ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2318(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: ۟ۥ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2319(Object obj, int i) {
        if (C0014.m3353() <= 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* renamed from: ۟ۥ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2320() {
        return (-770) ^ C0016.f368;
    }

    /* renamed from: ۟ۥۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String[] m2321() {
        if (m2320() < 0) {
            return E.k;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2322(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((com.github.catvod.spider.merge.U.k) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2323(Object obj) {
        if (C0003.m1463() < 0) {
            return ((C0147d) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟ۥۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2324(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return b.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static FrameLayout m2325(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((q) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2326(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m2327(Object obj, Object obj2) {
        if (C0042.m7147() < 0) {
            return ((WindowInsets.Builder) obj).setDisplayCutout((DisplayCutout) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2328(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((HBfling) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۨۤ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m2329(Object obj) {
        if (C0001.m1164() < 0) {
            return Xb6v.e((h) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۨۥ۠, reason: not valid java name and contains not printable characters */
    public static char m2330(Object obj) {
        if (C0014.m3353() < 0) {
            return ((O) obj).c();
        }
        return (char) 0;
    }

    /* renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2331(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((HBPguo) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m2332() {
        if (C0040.m6582() >= 0) {
            return C.i;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2333(Object obj, Object obj2, int i) {
        if (C0013.m3167() >= 0) {
            return ((InputMethodManager) obj).showSoftInput((View) obj2, i);
        }
        return false;
    }

    /* renamed from: ۟ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m2334(Object obj) {
        if (C0037.m6350() < 0) {
            return ((a) obj).E;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۨۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2335(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((Cipher) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2336(Object obj) {
        if (C0006.m1726() < 0) {
            return ((P) obj).n();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۢۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.g m2337() {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.P0.g.b;
        }
        return null;
    }

    /* renamed from: ۟ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I.b m2338(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.I.h) obj).a();
        }
        return null;
    }

    /* renamed from: ۠۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m2339(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.merge.T0.r) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2340(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.k) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m2341() {
        if (C0030.m5375() > 0) {
            return ".*Jb?(\\d+).*";
        }
        return null;
    }

    /* renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m2342(Object obj) {
        if (C0036.m6252() >= 0) {
            return UC.proxy((Map) obj);
        }
        return null;
    }

    /* renamed from: ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2343(Object obj) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.B.l) obj).e;
        }
        return false;
    }

    /* renamed from: ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m2344(Object obj) {
        if (C0022.m4497() > 0) {
            ((com.github.catvod.spider.p000mergexbpq.Q.l) obj).a();
        }
    }

    /* renamed from: ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2345(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            ((C0304g) obj).a((String) obj2);
        }
    }

    /* renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Map m2346(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0045.m7538() <= 0) {
            return HBlingDu.c((String) obj, (HashMap) obj2, (Map) obj3, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2347() {
        if (C0029.m5282() >= 0) {
            return "dtCate";
        }
        return null;
    }

    /* renamed from: ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2348(Object obj) {
        if (C0000.m1116() < 0) {
            return ((WindowInsets) obj).getStableInsetBottom();
        }
        return 0;
    }

    /* renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2349() {
        if (C0018.m3956() >= 0) {
            return "--&";
        }
        return null;
    }

    /* renamed from: ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2350() {
        if (C0054.m8557() <= 0) {
            return "免嗅";
        }
        return null;
    }

    /* renamed from: ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m2351(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((Reference) obj).get();
        }
        return null;
    }

    /* renamed from: ۢۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2352(int i) {
        if (C0023.m4566() < 0) {
            return com.github.catvod.spider.merge.g0.g.f(i);
        }
        return null;
    }

    /* renamed from: ۢۧۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2353(Object obj) {
        if (C0018.m3956() > 0) {
            d.f((LinkedHashSet) obj);
        }
    }

    /* renamed from: ۢۨۧۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2354(Object obj, double d) {
        if (C0052.m8320() > 0) {
            return ((StringBuilder) obj).append(d);
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m2355(Object obj, int i) {
        if (C0036.m6252() > 0) {
            return ((StaticLayout.Builder) obj).setHyphenationFrequency(i);
        }
        return null;
    }

    /* renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static Pattern m2356(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((a) obj).m0;
        }
        return null;
    }

    /* renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Bitmap m2357(Object obj, int i, int i2) {
        if (C0019.m4065() < 0) {
            return BitmapFactory.decodeByteArray((byte[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۣۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2358() {
        if (C0019.m4065() <= 0) {
            return "{lang}";
        }
        return null;
    }

    /* renamed from: ۣۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int[] m2359(int i) {
        if (C0053.m8389() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.l.a.b(i);
        }
        return null;
    }

    /* renamed from: ۣۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2360(Object obj) {
        if (C0037.m6350() < 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan();
        }
        return 0;
    }

    /* renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m2361(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((Youku) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2362(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).i;
        }
        return false;
    }

    /* renamed from: ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static M m2363(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((M) obj).p();
        }
        return null;
    }

    /* renamed from: ۤۢ۟۠, reason: not valid java name and contains not printable characters */
    public static HBcms10 m2364(Object obj) {
        if (C0051.m8216() < 0) {
            return ((HBDmSou) obj).i;
        }
        return null;
    }

    /* renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2365(Object obj) {
        if (C0038.m6471() > 0) {
            return com.github.catvod.spider.merge.B.m.c((Class) obj);
        }
        return 0;
    }

    /* renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2366(Object obj) {
        if (C0063.m9589() <= 0) {
            ((C0340u) obj).f();
        }
    }

    /* renamed from: ۣۤۨ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m2367(Object obj) {
        if (C0041.m6823() < 0) {
            return ((AppZzun) obj).a;
        }
        return null;
    }

    /* renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static String m2368(Object obj) {
        if (C0047.m7837() > 0) {
            return ((o) obj).d();
        }
        return null;
    }

    /* renamed from: ۥۡۢۤ, reason: contains not printable characters */
    public static void m2369(Object obj) {
        if (C0019.m4065() <= 0) {
            ((WebView) obj).clearHistory();
        }
    }

    /* renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static C0172d m2370() {
        if (C0009.m2047() > 0) {
            return n.u;
        }
        return null;
    }

    /* renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static String m2371(Object obj) {
        if (C0043.m7332() > 0) {
            return ((C0232A) obj).f;
        }
        return null;
    }

    /* renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static String m2372(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((o) obj).e();
        }
        return null;
    }

    /* renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.W.t m2373(Object obj) {
        if (C0000.m1116() <= 0) {
            return com.github.catvod.spider.merge.W.t.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static int m2374(int i) {
        if (C0005.m1599() < 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* renamed from: ۥۧ۠, reason: contains not printable characters */
    public static int m2375(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((View) obj).getId();
        }
        return 0;
    }

    /* renamed from: ۦ۠۟ۦ, reason: contains not printable characters */
    public static String m2376() {
        if (C0051.m8216() <= 0) {
            return "/proxy\"]:hover {\n            background-color: #d6eaff;\n            transform: translateY(-2px);\n            box-shadow: 0 4px 8px rgba(0, 123, 255, 0.15);\n        }\n        \n        a[href^=\"";
        }
        return null;
    }

    /* renamed from: ۦۤۧ۠, reason: contains not printable characters */
    public static JSONArray m2377(Object obj, int i, Object obj2) {
        if (C0025.m4797() > 0) {
            return ((JSONArray) obj).put(i, obj2);
        }
        return null;
    }

    /* renamed from: ۦۦۦۡ, reason: contains not printable characters */
    public static boolean m2378(Object obj) {
        if (C0000.m1116() < 0) {
            return ((AccessibilityNodeInfo) obj).isEditable();
        }
        return false;
    }

    /* renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static SecureRandom m2379() {
        if (C0020.m4210() <= 0) {
            return HBqwKan.c;
        }
        return null;
    }

    /* renamed from: ۨۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2380(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).g();
        }
        return null;
    }

    /* renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.t m2381(Object obj) {
        if (C0032.m5686() <= 0) {
            return com.github.catvod.spider.merge.W.t.e((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2382(Object obj) {
        if (C0035.m6140() < 0) {
            return ((C0335o) obj).c;
        }
        return null;
    }

    /* renamed from: ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m2383(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            ((C0233B) obj).k((com.github.catvod.spider.merge.E.j) obj2);
        }
    }

    /* renamed from: ۨۤۥۡ, reason: not valid java name and contains not printable characters */
    public static IBinder m2384(Object obj) {
        if (C0022.m4497() > 0) {
            return ((View) obj).getWindowToken();
        }
        return null;
    }

    /* renamed from: ۨۥۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2385(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((Douban) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۦۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2386(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0047.m7837() > 0) {
            return ((AtomicReferenceFieldUpdater) obj).compareAndSet(obj2, obj3, obj4);
        }
        return false;
    }

    /* renamed from: ۨۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2387() {
        if (C0060.m9355() > 0) {
            return ".*[\\[|\\|].*(http[^\\]]*)\\]?.*";
        }
        return null;
    }

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static DateFormatSymbols m2388(Object obj) {
        if (C0041.m6823() <= 0) {
            return DateFormatSymbols.getInstance((Locale) obj);
        }
        return null;
    }

    /* renamed from: ۨۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2389(Object obj) {
        if (C0024.m4693() <= 0) {
            AbstractC0287f.a((WebView) obj);
        }
    }

    /* renamed from: ۨۧۦۦ, reason: not valid java name and contains not printable characters */
    public static c m2390(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((AList) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2391(Object obj) {
        if (C0003.m1463() < 0) {
            return ((Pattern) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2300(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}