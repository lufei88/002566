package com.github.catvod.spider.p000mergexbpq.S;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.PersistableBundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.BilibiliLive;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.L.b;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.a;
import com.github.catvod.spider.merge.T0.k;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.f;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.n;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.e0.C0286e;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.RunnableC0282a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0312A;
import com.github.catvod.spider.merge.h0.y;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0415a;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.S.۟ۨۥ۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0005 {

    /* renamed from: ۦۣۡۧ, reason: contains not printable characters */
    public static int f164 = 178;

    /* renamed from: ۟۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m1589() {
        if (C0002.m1242() >= 0) {
            return a.e;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m1590(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m1591(Object obj) {
        if (C0027.m5017() > 0) {
            return ((C0147d) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1592(Object obj) {
        if (C0015.m3433() > 0) {
            return ((r) obj).e();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static char[] m1593(int i) {
        if (C0025.m4797() > 0) {
            return Character.toChars(i);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1594(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0054.m8557() <= 0) {
            return e.g((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m1595(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0033.m5872() > 0) {
            return ((BilibiliLive) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1596(Object obj, Object obj2) {
        if (C0014.m3353() < 0) {
            return ((PersistableBundle) obj).getString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1597() {
        if (C0039.m6529() < 0) {
            return "播放二次截取";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1598(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1599() {
        return 779 ^ C0031.f629;
    }

    /* renamed from: ۟ۡ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1600(Object obj) {
        if (C0063.m9589() < 0) {
            return ((F) obj).h();
        }
        return false;
    }

    /* renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1601(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0031.m5628() >= 0) {
            return ((C0254o) obj).s((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m1602(Object obj) {
        if (C0003.m1463() < 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static IvParameterSpec m1603() {
        if (C0056.m8886() <= 0) {
            return FishHxq.f;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1604(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((C0315D) obj).d;
        }
        return false;
    }

    /* renamed from: ۣ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1605(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C0286e) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1606(int i) {
        if (C0051.m8216() <= 0) {
            return n.a(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1607(Object obj) {
        if (C0000.m1116() < 0) {
            return ((W) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۤۤۥۣ, reason: not valid java name and contains not printable characters */
    public static int m1608(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            return Collections.binarySearch((List) obj, obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1609(Object obj) {
        if (C0053.m8389() >= 0) {
            ((HBmoou) obj).setDev();
        }
    }

    /* renamed from: ۟ۥ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1610(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.e) obj).g();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m1611(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((Uri.Builder) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۡۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m1612() {
        if (C0045.m7538() <= 0) {
            return AppYsV2.e;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m1613(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, int i, boolean z3) {
        if (C0001.m1164() <= 0) {
            ((L) obj).g((C0145b) obj2, (C0148e) obj3, (HashSet) obj4, z, z2, i, z3);
        }
    }

    /* renamed from: ۟ۦ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1614(Object obj) {
        if (C0045.m7538() < 0) {
            return ((M) obj).p;
        }
        return false;
    }

    /* renamed from: ۟ۦۤۧۥ, reason: not valid java name and contains not printable characters */
    public static S m1615(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((y) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m1616(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.P0.n) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1617(char c) {
        if (C0014.m3353() <= 0) {
            return Character.isWhitespace(c);
        }
        return false;
    }

    /* renamed from: ۟ۧ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1618(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.W.r) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1619(Object obj) {
        if (C0037.m6350() < 0) {
            return ((r) obj).H();
        }
        return 0;
    }

    /* renamed from: ۠۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1620(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            ((r) obj).E((r) obj2);
        }
    }

    /* renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1621(Object obj) {
        if (C0029.m5282() >= 0) {
            return f.a((Exception) obj);
        }
        return null;
    }

    /* renamed from: ۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m1622(Object obj, Object obj2, Object obj3) {
        if (C0016.m3596() <= 0) {
            return ((ConcurrentMap) obj).putIfAbsent(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۠ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1623(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return ((Matcher) obj).replaceAll((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static m m1624(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).m;
        }
        return null;
    }

    /* renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static List m1625(Object obj) {
        if (C0034.m6048() < 0) {
            return ((InterfaceC0415a) obj).getAnnotations();
        }
        return null;
    }

    /* renamed from: ۡ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1626(Object obj, boolean z) {
        if (C0003.m1463() < 0) {
            ((Thread) obj).setDaemon(z);
        }
    }

    /* renamed from: ۡ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1627(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            ((HorizontalScrollView) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۡۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m1628(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            ((com.github.catvod.spider.merge.E.m) obj).j((String) obj2);
        }
    }

    /* renamed from: ۡۤۥۥ, reason: not valid java name and contains not printable characters */
    public static C0288g m1629(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((RunnableC0282a) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1630(Object obj) {
        if (C0064.m9659() < 0) {
            return ((ShortcutManager) obj).getIconMaxWidth();
        }
        return 0;
    }

    /* renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static b m1631(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return b.b((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1632(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((Config) obj).j;
        }
        return null;
    }

    /* renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1633(Object obj) {
        if (C0014.m3353() < 0) {
            return ((Drawable) obj).mutate();
        }
        return null;
    }

    /* renamed from: ۢۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1634(Object obj) {
        if (C0006.m1726() < 0) {
            return ((C0233B) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1635(Object obj, Object obj2) {
        if (C0034.m6048() <= 0) {
            ((M) obj).k((j) obj2);
        }
    }

    /* renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1636(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((k) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1637(String str) {
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

    /* renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static Constructor m1638(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((Class) obj).getDeclaredConstructor((Class[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1639() {
        if (C0025.m4797() >= 0) {
            return "登录";
        }
        return null;
    }

    /* renamed from: ۣۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1640(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Locale) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۣۦۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1641(Object obj) {
        if (C0008.m1975() > 0) {
            ((Iterator) obj).remove();
        }
    }

    /* renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1642(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((AccessibilityNodeInfo) obj).getMaxTextLength();
        }
        return 0;
    }

    /* renamed from: ۤ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m1643(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((M) obj).m((j) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1644(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((Point) obj).y;
        }
        return 0;
    }

    /* renamed from: ۤۥۣ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1646(Object obj) {
        if (C0057.m9017() > 0) {
            return ((AccessibilityNodeInfo) obj).getPaneTitle();
        }
        return null;
    }

    /* renamed from: ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1647(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1648() {
        if (C0013.m3167() >= 0) {
            h.c();
        }
    }

    /* renamed from: ۥ۟ۦۦ, reason: contains not printable characters */
    public static String m1649() {
        if (C0053.m8389() > 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma')\n                .then(r => r.text())\n                .then(text => showStatus(text || '✅ 扫码请求已发送，请打开电视端扫码', 'success'))\n                .catch(() => showStatus('❌ 推送失败，请检查服务是否运行', 'failure'));\n        }\n\n        // 切换弹幕面板\n        toggleDanmuBtn.addEventListener('click', () => {\n            const isHidden = getComputedStyle(danmuPanel).display === 'none';\n            danmuPanel.style.display = isHidden ? 'block' : 'none';\n            toggleDanmuBtn.innerHTML = isHidden \n                ? '<i class=\"fas fa-eye-slash\"></i> 隐藏面板' \n                : '<i class=\"fas fa-comment-dots\"></i> 发弹幕';\n            if (isHidden) setTimeout(() => danmuMessage.focus(), 100);\n        });\n\n        // 发送弹幕\n        sendDanmuBtn.addEventListener('click', () => {\n            const username = danmuUsername.value.trim();\n            const message = danmuMessage.value.trim();\n            if (!username) return showStatus('请输入昵称', 'failure');\n            if (!message) return showStatus('请输入弹幕内容', 'failure');\n            if (message.length > 50) return showStatus('弹幕内容过长（≤50字）', 'failure');\n\n            const url = `";
        }
        return null;
    }

    /* renamed from: ۥۢۦۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.B.h m1650(Object obj) {
        if (C0052.m8320() > 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static void m1651(Object obj, boolean z) {
        if (C0012.m3024() > 0) {
            ((Bitmap) obj).setHasMipMap(z);
        }
    }

    /* renamed from: ۥۣۥۣ, reason: contains not printable characters */
    public static String m1652() {
        if (C0034.m6048() < 0) {
            return "\">  <a href=\"#\" class=\"episode-link\">";
        }
        return null;
    }

    /* renamed from: ۥۣۥۧ, reason: contains not printable characters */
    public static C0172d m1653() {
        if (C0021.m4379() > 0) {
            return com.github.catvod.spider.merge.P0.n.j;
        }
        return null;
    }

    /* renamed from: ۥۥ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.h m1654(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.h) obj).t0((E) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۢۧ, reason: contains not printable characters */
    public static void m1655(Object obj, Object obj2) throws ProtocolException {
        if (C0022.m4497() >= 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* renamed from: ۦ۠۠ۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.d m1656(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.d) obj).h((List) obj2);
        }
        return null;
    }

    /* renamed from: ۦۣۥ, reason: contains not printable characters */
    public static Object m1657(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((Stack) obj).push(obj2);
        }
        return null;
    }

    /* renamed from: ۦۤۧ۟, reason: contains not printable characters */
    public static TimeZone m1658(Object obj) {
        if (C0059.m9257() < 0) {
            return TimeZone.getTimeZone((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۤۨ۠, reason: contains not printable characters */
    public static HashMap m1659() {
        if (C0045.m7538() <= 0) {
            return g.e;
        }
        return null;
    }

    /* renamed from: ۦۦۢ۟, reason: contains not printable characters */
    public static void m1660() {
        if (C0052.m8320() > 0) {
            com.github.catvod.spider.merge.e1.d.e();
        }
    }

    /* renamed from: ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1661(Object obj) {
        if (C0029.m5282() > 0) {
            return ((i) obj).b();
        }
        return null;
    }

    /* renamed from: ۧ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m1662(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).S;
        }
        return null;
    }

    /* renamed from: ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1663(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            ((S) obj).m((String) obj2);
        }
    }

    /* renamed from: ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1664(Object obj, boolean z) {
        if (C0021.m4379() >= 0) {
            ((WebSettings) obj).setAppCacheEnabled(z);
        }
    }

    /* renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1665(Object obj) {
        if (C0056.m8886() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.c0.n.f((String) obj);
        }
        return false;
    }

    /* renamed from: ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m1666(Object obj, Object obj2, Object obj3) {
        if (C0018.m3956() >= 0) {
            return ((C0281k) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1667() {
        if (C0032.m5686() < 0) {
            return HBv1Class.generate13DigitTimestamp();
        }
        return null;
    }

    /* renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1668(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.merge.H.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1669(Object obj) {
        if (C0045.m7538() <= 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* renamed from: ۨ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m1670(Object obj) {
        if (C0064.m9659() < 0) {
            return ((C0335o) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1671(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((RunnableC0312A) obj).a;
        }
        return 0;
    }

    /* renamed from: ۨۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m1672(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).j((String) obj2);
        }
    }

    /* renamed from: ۨۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1673(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((C0273c) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۨۥۣۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1674(Object obj) {
        if (C0059.m9257() <= 0) {
            return FishHxq.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1675(Object obj) {
        if (C0024.m4693() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.f) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1676() {
        if (C0059.m9257() < 0) {
            return "fetch";
        }
        return null;
    }

    /* renamed from: ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1645(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}