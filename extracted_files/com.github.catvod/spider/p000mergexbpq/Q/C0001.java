package com.github.catvod.spider.p000mergexbpq.Q;

import android.app.Activity;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.GnssStatus;
import android.util.SparseIntArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.DragStartHelper;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.HBPQ;
import com.github.catvod.spider.HBT4;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.k;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E0.j;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0156m;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.b;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.o;
import com.github.catvod.spider.merge.U.p;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.f;
import com.github.catvod.spider.merge.b0.g;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d.C0269d;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e0.AbstractC0287f;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0292c;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AnimationAnimationListenerC0331k;
import com.github.catvod.spider.merge.h0.RunnableC0322b;
import com.github.catvod.spider.merge.h0.RunnableC0328h;
import com.github.catvod.spider.merge.h0.RunnableC0336p;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.i;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.n;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.m;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.Q.ۣۥۢۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0001 {

    /* renamed from: ۥۦۣۨ, reason: contains not printable characters */
    public static int f154 = 974;

    /* renamed from: ۟۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static d m1136(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static C0292c m1137(Object obj) {
        if (C0064.m9659() < 0) {
            return ((C0292c) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1138(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1139(Object obj) {
        if (C0046.m7701() > 0) {
            ((AList) obj).a();
        }
    }

    /* renamed from: ۟۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static double m1140(double d) {
        if (C0041.m6823() <= 0) {
            return Math.ceil(d);
        }
        return 0.0d;
    }

    /* renamed from: ۟۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1141(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((g) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1142(Object obj, int i, Object obj2) {
        if (C0023.m4566() < 0) {
            ((Drawable) obj).setColorFilter(i, (PorterDuff.Mode) obj2);
        }
    }

    /* renamed from: ۟۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1143(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.W0.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m1144(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((AnimationAnimationListenerC0331k) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1145(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).o;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1146() {
        if (C0052.m8320() > 0) {
            return "ext";
        }
        return null;
    }

    /* renamed from: ۟ۡۦۤۧ, reason: not valid java name and contains not printable characters */
    public static C0163u m1147(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((L) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1148(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((f) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1149() {
        if (C0040.m6582() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1150(Object obj) {
        if (C0055.m8740() > 0) {
            return ((c) obj).h();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1151(Object obj, Object obj2, Object obj3) {
        if (C0046.m7701() > 0) {
            return ((p) obj).f((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m1152(Object obj) {
        if (C0049.m8038() < 0) {
            return ((Buffer) obj).limit();
        }
        return 0;
    }

    /* renamed from: ۟ۢۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1153(Object obj, Object obj2) {
        if (C0014.m3353() < 0) {
            return n.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1154(Object obj) {
        if (C0030.m5375() > 0) {
            return ((File) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1155(Object obj) {
        if (C0049.m8038() < 0) {
            ((S) obj).j();
        }
    }

    /* renamed from: ۣ۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static FrameLayout m1156(Object obj) {
        if (C0030.m5375() > 0) {
            return ((x) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m1157(Object obj) {
        if (C0062.m9429() > 0) {
            return ((C0156m) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m1158(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Process) obj).getInputStream();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1159() {
        if (C0060.m9355() > 0) {
            return "dtFromNode";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1160(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((HBPQ) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1161(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((GnssStatus) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1162(Object obj) {
        if (C0032.m5686() < 0) {
            return ((b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1163(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((Map.Entry) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۟ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m1164() {
        return (-282) ^ C0004.f163;
    }

    /* renamed from: ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1165() {
        if (C0012.m3024() > 0) {
            return "跳转post";
        }
        return null;
    }

    /* renamed from: ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1166(Object obj) {
        if (C0037.m6350() < 0) {
            return ((RunnableC0322b) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1167(Object obj) {
        if (C0048.m7971() > 0) {
            return ((M) obj).f;
        }
        return false;
    }

    /* renamed from: ۟ۥۦۨۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m1168(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((Youku) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1169(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0009.m2047() > 0) {
            return ((UC) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۤۨ, reason: not valid java name and contains not printable characters */
    public static m m1170() {
        if (C0036.m6252() > 0) {
            return m.i;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۧۨ, reason: not valid java name and contains not printable characters */
    public static CookieSyncManager m1171() {
        if (C0029.m5282() > 0) {
            return CookieSyncManager.getInstance();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۧۨ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m1172(Object obj) {
        if (C0017.m3633() < 0) {
            return ((q) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1173(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            ((l) obj).k((JSONObject) obj2);
        }
    }

    /* renamed from: ۟ۦۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1174(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() <= 0) {
            ((l) obj).c((String) obj2, (ArrayList) obj3);
        }
    }

    /* renamed from: ۟ۦۤۤ۠, reason: not valid java name and contains not printable characters */
    public static CookieManager m1175() {
        if (C0064.m9659() < 0) {
            return CookieManager.getInstance();
        }
        return null;
    }

    /* renamed from: ۟ۦۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1176(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((RunnableC0328h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1177(Object obj, int i, int i2) {
        if (C0012.m3024() >= 0) {
            return ((String) obj).indexOf(i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1178(Object obj) {
        if (C0024.m4693() < 0) {
            return ((Class) obj).isArray();
        }
        return false;
    }

    /* renamed from: ۟ۧ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m1179(Object obj) {
        if (m1164() < 0) {
            return ((AccessibilityNodeInfo) obj).getTraversalBefore();
        }
        return null;
    }

    /* renamed from: ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m1180() {
        if (C0052.m8320() >= 0) {
            return "CODE";
        }
        return null;
    }

    /* renamed from: ۟ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1181(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((RunnableC0336p) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1182(Object obj) {
        if (C0042.m7147() < 0) {
            return ((k) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1183(Object obj, Object obj2) {
        if (m1164() < 0) {
            return ((DragStartHelper) obj).onLongClick((View) obj2);
        }
        return false;
    }

    /* renamed from: ۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static Map m1184(Object obj) {
        if (C0020.m4210() < 0) {
            return Collections.unmodifiableMap((Map) obj);
        }
        return null;
    }

    /* renamed from: ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1185(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).i;
        }
        return null;
    }

    /* renamed from: ۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static List m1186(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((ShortcutManager) obj).getPinnedShortcuts();
        }
        return null;
    }

    /* renamed from: ۠ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1187(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.merge.b0.m) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1188(Object obj) {
        if (C0020.m4210() <= 0) {
            ((C0233B) obj).q();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.catvod.spider.merge-xbpq.P.E<com.github.catvod.spider.merge-xbpq.P.k>, com.github.catvod.spider.merge-xbpq.P.l] */
    /* renamed from: ۠ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.l m1190() {
        if (C0047.m7837() > 0) {
            return com.github.catvod.spider.p000mergexbpq.P.l.a;
        }
        return null;
    }

    /* renamed from: ۠ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1191(Object obj, int i) {
        if (C0051.m8216() < 0) {
            return ((SparseIntArray) obj).get(i);
        }
        return 0;
    }

    /* renamed from: ۠ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static void m1192(Object obj) {
        if (C0021.m4379() > 0) {
            ((com.github.catvod.spider.merge.a0.M) obj).w();
        }
    }

    /* renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1193(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((C0144a) obj).i;
        }
        return null;
    }

    /* renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static SupportMenuItem m1194(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((SupportMenuItem) obj).setTooltipText((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m1195(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            ((View) obj).getLocationOnScreen((int[]) obj2);
        }
    }

    /* renamed from: ۡۥ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m1196(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((w) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1197(Object obj) {
        if (C0004.m1557() <= 0) {
            ((C0259u) obj).a();
        }
    }

    /* renamed from: ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m1198(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.U.m) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1199() {
        if (m1164() < 0) {
            return AbstractC0287f.c;
        }
        return false;
    }

    /* renamed from: ۢ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1200(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((P) obj).k((String) obj2);
        }
        return false;
    }

    /* renamed from: ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1201(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((W) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1202(Object obj) {
        if (C0027.m5017() > 0) {
            return ((Insets) obj).bottom;
        }
        return 0;
    }

    /* renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static List m1203(Object obj) {
        if (C0061.m9359() <= 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* renamed from: ۢۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1204(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((v) obj).g;
        }
        return 0;
    }

    /* renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static j m1205(Object obj) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.merge.E0.q) obj).c;
        }
        return null;
    }

    /* renamed from: ۤ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m1206(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).a((String) obj2);
        }
    }

    /* renamed from: ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1207(Object obj, int i, Object obj2) {
        if (C0009.m2047() > 0) {
            ((List) obj).add(i, obj2);
        }
    }

    /* renamed from: ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1208(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((ExecutorService) obj).isTerminated();
        }
        return false;
    }

    /* renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static i m1209(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static void m1210(Object obj, boolean z) {
        if (C0004.m1557() < 0) {
            ((AccessibilityNodeInfo) obj).setDismissable(z);
        }
    }

    /* renamed from: ۤۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static r m1211(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((r) obj).m();
        }
        return null;
    }

    /* renamed from: ۤۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1212(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((JSONObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1213() {
        if (C0049.m8038() < 0) {
            return "e";
        }
        return null;
    }

    /* renamed from: ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1214(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).n0();
        }
        return null;
    }

    /* renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static String m1215() {
        if (C0017.m3633() < 0) {
            return "播放列表";
        }
        return null;
    }

    /* renamed from: ۥ۠ۨۢ, reason: contains not printable characters */
    public static Buffer m1216(Object obj) {
        if (C0064.m9659() < 0) {
            return ((IntBuffer) obj).flip();
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static String m1217(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((W) obj).h;
        }
        return null;
    }

    /* renamed from: ۥۡۤۡ, reason: contains not printable characters */
    public static C0266a m1218(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((C0269d) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۢۡۢ, reason: contains not printable characters */
    public static String m1219() {
        if (C0054.m8557() < 0) {
            return "哔哩";
        }
        return null;
    }

    /* renamed from: ۥۤۢۨ, reason: contains not printable characters */
    public static int m1220(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static String m1221(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static String m1222() {
        if (C0064.m9659() < 0) {
            return "直接播放直链视频请求头";
        }
        return null;
    }

    /* renamed from: ۥۧۥۤ, reason: contains not printable characters */
    public static String m1223(Object obj) {
        if (C0011.m2755() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.g) obj).d();
        }
        return null;
    }

    /* renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static String m1224() {
        if (C0009.m2047() > 0) {
            return "免嗅错误！-->";
        }
        return null;
    }

    /* renamed from: ۦۤ۠ۥ, reason: contains not printable characters */
    public static String m1225(Object obj, int i) {
        if (C0027.m5017() > 0) {
            return ((Resources) obj).getResourceEntryName(i);
        }
        return null;
    }

    /* renamed from: ۦۤۡ, reason: contains not printable characters */
    public static String m1226() {
        if (C0016.m3596() <= 0) {
            return "\"  tabindex=\"0\">\n          <span class=\"episode-number\">";
        }
        return null;
    }

    /* renamed from: ۦۥ, reason: contains not printable characters */
    public static Object[] m1227(Object obj) {
        if (C0023.m4566() <= 0) {
            return com.github.catvod.spider.merge.V.a.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۧ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static char[] m1228() {
        if (C0048.m7971() >= 0) {
            return o.a;
        }
        return null;
    }

    /* renamed from: ۣۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m1229(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return com.github.catvod.spider.merge.R.a.c((String) obj, (JSONObject) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1230(Object obj) {
        if (C0046.m7701() > 0) {
            h.f((ArrayList) obj);
        }
    }

    /* renamed from: ۧۡۤۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionItemInfo m1231(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((AccessibilityNodeInfo) obj).getCollectionItemInfo();
        }
        return null;
    }

    /* renamed from: ۧۦۢۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m1232(Object obj) {
        if (C0015.m3433() > 0) {
            return ((com.github.catvod.spider.merge.V0.m) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1233(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((f) obj).size();
        }
        return 0;
    }

    /* renamed from: ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static Activity m1234(Object obj) {
        if (C0003.m1463() < 0) {
            return ((q) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1235(Object obj) {
        if (C0014.m3353() < 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).i;
        }
        return 0;
    }

    /* renamed from: ۣۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m1236(Object obj) {
        if (C0040.m6582() > 0) {
            return l.f((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1237(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((HBT4) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static OutputStream m1238(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((URLConnection) obj).getOutputStream();
        }
        return null;
    }

    /* renamed from: ۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1189(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}