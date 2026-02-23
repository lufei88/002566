package com.github.catvod.spider.merge.N;

import android.app.Notification;
import android.content.pm.PackageInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.pm.SigningInfo;
import android.graphics.Insets;
import android.graphics.Paint;
import android.os.IBinder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.view.WindowInsetsAnimationController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebHistoryItem;
import android.widget.EditText;
import android.widget.Scroller;
import android.widget.TextView;
import com.github.catvod.spider.HBwwgg;
import com.github.catvod.spider.QxiTv;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.XBPQAli;
import com.github.catvod.spider.XPathMac;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.f0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G.c;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.d;
import com.github.catvod.spider.merge.M.e;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.N;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.p;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.k;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.O;
import com.github.catvod.spider.merge.a0.RunnableC0244e;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.l;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.AbstractC0274d;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0290a;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.P.s;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.N.ۨۥۣۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0023 {

    /* renamed from: ۥۢۧۡ, reason: contains not printable characters */
    public static int f470 = -546;

    /* renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4535(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((C0340u) obj).h;
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4537(String str) {
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

    /* renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4538(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.V.a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static SigningInfo m4539(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((PackageInfo) obj).signingInfo;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4540(Object obj) {
        if (C0032.m5686() < 0) {
            return ((WebHistoryItem) obj).getUrl();
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4541(Object obj, boolean z) {
        if (C0039.m6529() <= 0) {
            return ((c) obj).k(z);
        }
        return false;
    }

    /* renamed from: ۟ۡۥۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4542(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4543(Object obj) {
        if (C0053.m8389() > 0) {
            return ((C) obj).d();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4544(Object obj) {
        if (C0008.m1975() >= 0) {
            m.d(obj);
        }
    }

    /* renamed from: ۟ۢۦۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4545(Object obj) {
        if (C0029.m5282() >= 0) {
            return k.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4546() {
        if (C0051.m8216() < 0) {
            return "url:";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4547(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).Y;
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.c m4548(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).c();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4549(Object obj) {
        if (C0010.m2320() < 0) {
            return ((XPathMac) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4550(Object obj) {
        if (C0062.m9429() > 0) {
            return ((HBwwgg) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m4551(Object obj, Object obj2, Object obj3) {
        if (C0003.m1463() < 0) {
            return ((ConcurrentHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4552(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((C0281k) obj).containsKey(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4553(Object obj) {
        if (C0050.m8121() <= 0) {
            return v.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m4554() {
        if (C0061.m9359() < 0) {
            return "searchContent()错误-->";
        }
        return null;
    }

    /* renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static Insets m4555(Object obj) {
        if (C0035.m6140() < 0) {
            return ((WindowInsetsAnimationController) obj).getCurrentInsets();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4556(Object obj) {
        if (C0031.m5628() > 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۦۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4557(Object obj, int i, int i2) {
        if (C0019.m4065() <= 0) {
            ((AccessibilityNodeInfo) obj).setTextSelection(i, i2);
        }
    }

    /* renamed from: ۟ۦۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4558() {
        if (C0022.m4497() > 0) {
            return "播放链接";
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4559(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0335o) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4560() {
        if (C0006.m1726() < 0) {
            return ">原画<";
        }
        return null;
    }

    /* renamed from: ۟ۦۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m4561(Object obj, int i, int i2, Object obj2, int i3) {
        if (C0027.m5017() >= 0) {
            return StaticLayout.Builder.obtain((CharSequence) obj, i, i2, (TextPaint) obj2, i3);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static Comparator m4562() {
        if (C0022.m4497() >= 0) {
            return String.CASE_INSENSITIVE_ORDER;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4563() {
        if (C0032.m5686() <= 0) {
            return "url";
        }
        return null;
    }

    /* renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4564(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((L) obj).i;
        }
        return false;
    }

    /* renamed from: ۟ۦۦۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4565(Object obj) {
        if (C0039.m6529() < 0) {
            return ((Display) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4566() {
        return (-864) ^ C0041.f702;
    }

    /* renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Paint m4567(Object obj) {
        if (C0044.m7508() < 0) {
            return ((C0314C) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4568(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4569() {
        if (C0021.m4379() >= 0) {
            return p.b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4570(Object obj) {
        if (C0062.m9429() >= 0) {
            return d.a((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۥۤۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4571(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((TextView) obj).getText();
        }
        return null;
    }

    /* renamed from: ۠ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m4572() {
        if (C0059.m9257() < 0) {
            return QxiTv.a();
        }
        return null;
    }

    /* renamed from: ۠ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m4573(Object obj) throws IOException {
        if (C0012.m3024() >= 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* renamed from: ۠ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m4574(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0046.m7701() >= 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).c((StringBuffer) obj2, (String) obj3, obj4);
        }
    }

    /* renamed from: ۣ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4575(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            ((View) obj).setOnKeyListener((View.OnKeyListener) obj2);
        }
    }

    /* renamed from: ۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4576(Object obj, Object obj2, int i) {
        if (C0003.m1463() <= 0) {
            C0273c.b((int[]) obj, (Object[]) obj2, i);
        }
    }

    /* renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4577(Object obj) {
        if (C0045.m7538() <= 0) {
            return URLConnection.guessContentTypeFromName((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Set m4578(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((ShortcutInfo) obj).getCategories();
        }
        return null;
    }

    /* renamed from: ۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4579() {
        if (C0035.m6140() < 0) {
            return ":document.documentElement.outerHTML";
        }
        return null;
    }

    /* renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m4580(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0176b) obj).i;
        }
        return null;
    }

    /* renamed from: ۠ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Map m4581() {
        if (C0046.m7701() >= 0) {
            return Collections.emptyMap();
        }
        return null;
    }

    /* renamed from: ۡۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4582(Object obj) {
        if (C0030.m5375() > 0) {
            return ((Symx) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static C0290a m4583() {
        if (C0063.m9589() <= 0) {
            return C0290a.c;
        }
        return null;
    }

    /* renamed from: ۡۦۡۡ, reason: not valid java name and contains not printable characters */
    public static N m4584(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C0176b) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4585(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            return ((C0271a) obj).f(obj2);
        }
        return 0;
    }

    /* renamed from: ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4586(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            ((C0233B) obj).u((String) obj2);
        }
    }

    /* renamed from: ۢۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4587(Object obj) {
        if (C0059.m9257() < 0) {
            return ((String) obj).toLowerCase();
        }
        return null;
    }

    /* renamed from: ۢۡۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4588(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            ((L) obj).e((j) obj2);
        }
    }

    /* renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4589(Object obj) {
        if (C0018.m3956() > 0) {
            return ((s) obj).h;
        }
        return 0;
    }

    /* renamed from: ۢۦ۟۟, reason: not valid java name and contains not printable characters */
    public static void m4590(Object obj, boolean z) {
        if (C0049.m8038() < 0) {
            ((TextView) obj).setHorizontallyScrolling(z);
        }
    }

    /* renamed from: ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4591() {
        if (C0047.m7837() > 0) {
            return com.github.catvod.spider.merge.F0.L.k;
        }
        return false;
    }

    /* renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4592(Object obj, int i, int i2, int i3, int i4, int i5) {
        if (C0002.m1242() > 0) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }
    }

    /* renamed from: ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static n m4593() {
        if (C0034.m6048() <= 0) {
            return com.github.catvod.spider.merge.Y.a.a;
        }
        return null;
    }

    /* renamed from: ۢۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4594(Object obj) {
        if (C0024.m4693() < 0) {
            return ((Charset) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4595(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).b();
        }
        return false;
    }

    /* renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U.d m4596() {
        if (C0019.m4065() <= 0) {
            return i.h;
        }
        return null;
    }

    /* renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m4597() {
        if (C0050.m8121() <= 0) {
            return XBPQAli.a;
        }
        return null;
    }

    /* renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4598(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.merge.T0.n) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۥۨۨ, reason: not valid java name and contains not printable characters */
    public static List m4599(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((L) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۦۤ۟, reason: not valid java name and contains not printable characters */
    public static Thread m4600(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((C0295f) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۧۧۢ, reason: not valid java name and contains not printable characters */
    public static Notification.Action[] m4601(Object obj) {
        if (C0030.m5375() > 0) {
            return ((Notification) obj).actions;
        }
        return null;
    }

    /* renamed from: ۤۧۤ۠, reason: not valid java name and contains not printable characters */
    public static C0246g m4602(Object obj) {
        if (C0021.m4379() > 0) {
            return ((RunnableC0244e) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4603(Object obj, Object obj2) {
        if (C0054.m8557() < 0) {
            ((ShortcutManager) obj).reportShortcutUsed((String) obj2);
        }
    }

    /* renamed from: ۥ۟ۥ۠, reason: contains not printable characters */
    public static void m4604(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            ((C0176b) obj).d((String[]) obj2);
        }
    }

    /* renamed from: ۥۢۢۨ, reason: contains not printable characters */
    public static String m4605(Object obj) {
        if (C0005.m1599() < 0) {
            return ((e) obj).h();
        }
        return null;
    }

    /* renamed from: ۥۥۦ, reason: contains not printable characters */
    public static boolean m4606(Object obj, Object obj2, int i) {
        if (C0049.m8038() <= 0) {
            return ((InputMethodManager) obj).hideSoftInputFromWindow((IBinder) obj2, i);
        }
        return false;
    }

    /* renamed from: ۥۥۨ۠, reason: contains not printable characters */
    public static int m4607(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۦۡۤۧ, reason: contains not printable characters */
    public static int m4608(Object obj) {
        if (C0036.m6252() > 0) {
            return ((ShortcutManager) obj).getIconMaxHeight();
        }
        return 0;
    }

    /* renamed from: ۦۡۦ۟, reason: contains not printable characters */
    public static f0 m4609(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return Q.a((C0144a) obj, (com.github.catvod.spider.merge.E0.p) obj2);
        }
        return null;
    }

    /* renamed from: ۦۢۡۤ, reason: contains not printable characters */
    public static void m4610(Object obj) throws IOException {
        if (m4566() <= 0) {
            ((ServerSocket) obj).close();
        }
    }

    /* renamed from: ۦۤۥ۟, reason: contains not printable characters */
    public static boolean m4611(Object obj, int i) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.merge.E0.s) obj).b(i);
        }
        return false;
    }

    /* renamed from: ۦۦۡۢ, reason: contains not printable characters */
    public static EditText m4612(Object obj) {
        if (C0030.m5375() > 0) {
            return ((O) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m4613(Object obj) {
        if (C0033.m5872() >= 0) {
            com.github.catvod.spider.p000mergexbpq.N.a.k(obj);
        }
    }

    /* renamed from: ۧۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4614(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            com.github.catvod.spider.merge.T0.m.y((r) obj, (StringBuilder) obj2);
        }
    }

    /* renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.n m4615() {
        if (m4566() <= 0) {
            return com.github.catvod.spider.merge.T0.n.f;
        }
        return null;
    }

    /* renamed from: ۧۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4616() {
        if (C0058.m9131() < 0) {
            return "线路数组";
        }
        return null;
    }

    /* renamed from: ۧۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4617(Object obj, int i, long j) {
        if (C0036.m6252() > 0) {
            return AbstractC0274d.b((long[]) obj, i, j);
        }
        return 0;
    }

    /* renamed from: ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m4618() {
        if (C0008.m1975() >= 0) {
            return ", extend=";
        }
        return null;
    }

    /* renamed from: ۣۧۧۢ, reason: not valid java name and contains not printable characters */
    public static String m4619() {
        if (C0040.m6582() > 0) {
            return "调试->xpDetailContent出错：";
        }
        return null;
    }

    /* renamed from: ۨۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4620(Object obj, int i, Object obj2, Object obj3) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.merge.F0.L) obj).b(i, (f) obj2, (com.github.catvod.spider.merge.E0.p) obj3);
        }
        return 0;
    }

    /* renamed from: ۟۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4536(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}