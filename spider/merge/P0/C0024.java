package com.github.catvod.spider.merge.P0;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.net.ssl.SSLSockets;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.HBgetappapi;
import com.github.catvod.spider.HBhcShun;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.WebDAV;
import com.github.catvod.spider.Ysj;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0228d;
import com.github.catvod.spider.merge.W.C0229e;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0278h;
import com.github.catvod.spider.merge.e.C0279i;
import com.github.catvod.spider.merge.e0.ViewOnKeyListenerC0289h;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0319H;
import com.github.catvod.spider.merge.h0.ViewOnClickListenerC0330j;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.AbstractC0368a;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.P0.ۦ۟ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0024 {

    /* renamed from: ۟۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int f488 = 208;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge-xbpq.Q.v>] */
    /* renamed from: ۟۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4644(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4645(Object obj) {
        if (C0034.m6048() <= 0) {
            ((com.github.catvod.spider.merge.X0.A) obj).n();
        }
    }

    /* renamed from: ۟۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Bundle m4646(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((Notification) obj).extras;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4647(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            C0045.m7649((Activity) obj, (com.github.catvod.spider.merge.B.p) obj2);
        }
    }

    /* renamed from: ۟۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4648(Object obj) {
        if (C0012.m3024() >= 0) {
            ((com.github.catvod.spider.merge.X0.A) obj).H();
        }
    }

    /* renamed from: ۟۟ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4649() {
        if (C0059.m9257() <= 0) {
            return "//";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static Pattern m4650() {
        if (C0019.m4065() < 0) {
            return com.github.catvod.spider.merge.l0.b.d;
        }
        return null;
    }

    /* renamed from: ۟۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4651() {
        if (C0038.m6471() > 0) {
            return ",";
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4652(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            ((Drawable) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static h m4653() {
        if (C0034.m6048() <= 0) {
            return n.p;
        }
        return null;
    }

    /* renamed from: ۟۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4654(Object obj) {
        if (C0049.m8038() < 0) {
            C0027.m5069((WebSettings) obj, 0);
        }
    }

    /* renamed from: ۟۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static SeekBar m4655(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0228d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Locale m4656() {
        if (C0027.m5017() >= 0) {
            return n.g;
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m4657(Object obj, Object obj2, Object obj3) {
        if (C0058.m9131() < 0) {
            return ((EnumMap) obj).put((EnumMap) obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m4658() {
        if (C0003.m1463() <= 0) {
            return C0273c.g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m4659(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() <= 0) {
            return AtomicReferenceFieldUpdater.newUpdater((Class) obj, (Class) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m4660() {
        if (C0013.m3167() > 0) {
            return HBhcShun.a();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static S m4661(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4662() {
        if (C0034.m6048() < 0) {
            return "\n\" tabindex=\"0\" />\n                </div>\n                <div class=\"danmu-btn-container\">\n                <button id=\"sendDanmuBtn\" tabindex=\"0\">发送弹幕</button>\n                </div>\n          `;\n        // 添加到DOM中，放在搜索容器下方\n        const searchContainer = document.querySelector('.search-container');\n        searchContainer.parentNode.insertBefore(danmuPanel, searchContainer.nextSibling);\n\n        // 获取面板内元素引用\n        const danmuMessage = document.getElementById('danmuMessage');\n        const danmuUsername = document.getElementById('danmuUsername');\n        const sendDanmuBtn = document.getElementById('sendDanmuBtn');\n\n        // 绑定发送事件\n        sendDanmuBtn.addEventListener('click', () => sendDanmu(danmuUsername, danmuMessage));\n\n        // 绑定Enter发送事件\n        danmuMessage.addEventListener('keydown', e => {\n            if (e.key === 'Enter' && !e.shiftKey) {\n                e.preventDefault();\n                sendDanmu(danmuUsername, danmuMessage);\n            }\n        });\n\n        // 更新可聚焦元素列表\n        updateFocusableElements();\n\n        // 设置焦点到文本框\n        setTimeout(() => danmuMessage.focus(), 100);\n    }\n\n    // 发送弹幕\n    function sendDanmu(usernameEl, messageEl) {\n        const username = usernameEl.value.trim();\n        const message = messageEl.value.trim();\n\n        if (!username) return showStatus('请输入昵称', 'failure');\n        if (!message) return showStatus('请输入弹幕内容', 'failure');\n        if (message.length > 50) return showStatus('弹幕内容过长（≤50字）', 'failure');\n\n        const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۢۡۧۥ, reason: not valid java name and contains not printable characters */
    public static long m4663(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.F.o) obj).q;
        }
        return 0L;
    }

    /* renamed from: ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static FrameLayout.LayoutParams m4664(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.W.C) obj).g;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static WebView m4665(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.W.x) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m4666(Object obj) {
        if (C0055.m8740() > 0) {
            return ((TextView) obj).getTextSize();
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int[] m4667() {
        if (C0044.m7508() <= 0) {
            return com.github.catvod.spider.merge.l0.f.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4668(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan();
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.b.p m4669(Object obj) {
        if (C0034.m6048() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.b) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4670(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).t();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4671(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.merge.h0.y) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4672(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.g) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4673(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0011.m2755() >= 0) {
            return ((Ysj) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4674(Object obj) {
        if (C0053.m8389() > 0) {
            return ((com.github.catvod.spider.merge.M.g) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4675(Object obj) {
        if (C0048.m7971() > 0) {
            return SSLSockets.isSupportedSocket((SSLSocket) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static Switch m4676(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m4677(String str) {
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

    /* renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m4678(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.merge.T0.j) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4679() {
        if (C0002.m1242() >= 0) {
            return ".*ookie\\$([^#]+?)#.*";
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4680(Object obj) {
        if (C0042.m7147() < 0) {
            ((Dialog) obj).cancel();
        }
    }

    /* renamed from: ۟ۥ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4681(Object obj, int i) {
        if (C0038.m6471() >= 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4682(Object obj) {
        if (C0030.m5375() > 0) {
            ((Thread) obj).start();
        }
    }

    /* renamed from: ۟ۥۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4683(Object obj, Object obj2) {
        if (C0050.m8121() < 0) {
            ((View) obj).setTag(obj2);
        }
    }

    /* renamed from: ۟ۥۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4684(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).j();
        }
        return null;
    }

    /* renamed from: ۟ۥۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4685(Object obj) {
        if (C0062.m9429() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.D) obj).getChannel();
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m4686(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.N0.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4687() {
        if (C0057.m9017() > 0) {
            return "搜索链接";
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۡ, reason: not valid java name and contains not printable characters */
    public static Collection m4688(Object obj) {
        if (C0063.m9589() < 0) {
            return ((Map) obj).values();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m4689(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((NG.DtIt) obj).getShow();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4690(Object obj) {
        if (C0039.m6529() < 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* renamed from: ۟ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Activity m4691(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((C0315D) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4692(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            ((WebSettings) obj).setLayoutAlgorithm((WebSettings.LayoutAlgorithm) obj2);
        }
    }

    /* renamed from: ۟ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4693() {
        return 542 ^ C0048.f769;
    }

    /* renamed from: ۟ۧۡۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4694(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return ((C0147d) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4695(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).f((com.github.catvod.spider.merge.Y0.b) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m4696(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.merge.V.c) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Object[] m4697() {
        if (C0043.m7332() > 0) {
            return C0273c.i;
        }
        return null;
    }

    /* renamed from: ۠۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4698() {
        if (C0001.m1164() <= 0) {
            return "outerHTML";
        }
        return null;
    }

    /* renamed from: ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static Appendable m4699(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            return ((Appendable) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static WeakReference m4700(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.merge.B.l) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static String m4701(Object obj) {
        if (C0028.m5152() < 0) {
            return O.m((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4702(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((j) obj).a();
        }
        return false;
    }

    /* renamed from: ۠ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static C0233B m4703(Object obj) {
        if (C0061.m9359() < 0) {
            return ((com.github.catvod.spider.merge.a0.x) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4704() {
        if (C0017.m3633() < 0) {
            return "空空空";
        }
        return null;
    }

    /* renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4705(Object obj) {
        if (C0017.m3633() < 0) {
            return ((M) obj).h;
        }
        return null;
    }

    /* renamed from: ۡۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4706(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((AbstractC0296g) obj).isDone();
        }
        return false;
    }

    /* renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static C0278h m4707(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((C0271a) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4708() {
        if (C0057.m9017() > 0) {
            return "vod_play_url";
        }
        return null;
    }

    /* renamed from: ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4709(Object obj) {
        if (C0043.m7332() > 0) {
            ((C0254o) obj).x();
        }
    }

    /* renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4710(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.merge.E.m) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static List m4711(Object obj) {
        if (C0060.m9355() > 0) {
            return ((ThreadPoolExecutor) obj).shutdownNow();
        }
        return null;
    }

    /* renamed from: ۢۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4712(Object obj, Object obj2, int i) {
        if (C0061.m9359() < 0) {
            ((com.github.catvod.spider.p000mergexbpq.P.w) obj).n((com.github.catvod.spider.p000mergexbpq.P.x) obj2, i);
        }
    }

    /* renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.d m4713(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.d) obj).a((Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4714(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            ((WebSettings) obj).setRenderPriority((WebSettings.RenderPriority) obj2);
        }
    }

    /* renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4715(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            ((com.github.catvod.spider.merge.T0.r) obj).v((com.github.catvod.spider.merge.T0.r) obj2);
        }
    }

    /* renamed from: ۣۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsetsController m4716(Object obj) {
        if (C0040.m6582() > 0) {
            return ((Window) obj).getInsetsController();
        }
        return null;
    }

    /* renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4717(Object obj) {
        if (C0037.m6350() < 0) {
            ((C0067a) obj).d();
        }
    }

    /* renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4718(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.O.b) obj).g;
        }
        return 0;
    }

    /* renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4719(Object obj) {
        if (C0055.m8740() > 0) {
            return com.github.catvod.spider.merge.K0.a.g((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4720(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).k((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4721() {
        if (C0013.m3167() >= 0) {
            return WindowInsets.Type.mandatorySystemGestures();
        }
        return 0;
    }

    /* renamed from: ۣۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4722(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.V0.f) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m4723() {
        if (C0057.m9017() >= 0) {
            return "{catePg}";
        }
        return null;
    }

    /* renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static StackTraceElement m4724(Object obj) {
        if (C0027.m5017() > 0) {
            return ((AbstractC0368a) obj).getStackTraceElement();
        }
        return null;
    }

    /* renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4725(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F0.S m4726(Object obj) {
        if (C0064.m9659() < 0) {
            return ((ViewOnKeyListenerC0289h) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4727(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((C0147d) obj).a((C0145b) obj2);
        }
        return false;
    }

    /* renamed from: ۤۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4728(Object obj) {
        if (C0023.m4566() < 0) {
            return AppYsV2.f((JSONArray) obj);
        }
        return null;
    }

    /* renamed from: ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4729(Object obj) {
        if (C0025.m4797() > 0) {
            return ((HBgetappapi) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4730(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4731(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.b0.p) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m4732(Object obj, int i, int i2) {
        if (C0048.m7971() >= 0) {
            return Arrays.copyOfRange((Object[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۥۦۥۤ, reason: contains not printable characters */
    public static Object m4733(Object obj, Object obj2) {
        if (C0026.m4977() < 0) {
            return Objects.requireNonNull(obj, (Supplier<String>) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧۥۧ, reason: contains not printable characters */
    public static Object m4734(Object obj) {
        if (C0034.m6048() < 0) {
            return ((ViewOnClickListenerC0330j) obj).d;
        }
        return null;
    }

    /* renamed from: ۦ۠ۤ۠, reason: contains not printable characters */
    public static Object m4735(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.W.h) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۢۤۧ, reason: contains not printable characters */
    public static String m4736(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).e;
        }
        return null;
    }

    /* renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static WebView m4737(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.W.t) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static String m4738() {
        if (C0025.m4797() >= 0) {
            return "User-Agent";
        }
        return null;
    }

    /* renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static boolean m4739(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0002.m1242() > 0) {
            return ((C0176b) obj).p((String[]) obj2, (String[]) obj3, (String[]) obj4);
        }
        return false;
    }

    /* renamed from: ۦۨۥۡ, reason: contains not printable characters */
    public static WebSettings.PluginState m4741() {
        if (C0058.m9131() < 0) {
            return WebSettings.PluginState.ON;
        }
        return null;
    }

    /* renamed from: ۣۧ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4742(Object obj) {
        if (C0002.m1242() > 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).e();
        }
        return null;
    }

    /* renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m4743() {
        if (C0037.m6350() <= 0) {
            return WebDAV.c;
        }
        return null;
    }

    /* renamed from: ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4744(Object obj, int i) {
        if (C0026.m4977() < 0) {
            ((BitSet) obj).clear(i);
        }
    }

    /* renamed from: ۧۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0170b m4745() {
        if (C0054.m8557() < 0) {
            return C0171c.c;
        }
        return null;
    }

    /* renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static SeekBar m4746(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((C0229e) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4747(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0279i) obj).b;
        }
        return 0;
    }

    /* renamed from: ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4748(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((Map) obj).containsKey(obj2);
        }
        return false;
    }

    /* renamed from: ۧۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m4749(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.H0.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static WebView m4750() {
        if (C0053.m8389() >= 0) {
            return com.github.catvod.spider.merge.W.n.a;
        }
        return null;
    }

    /* renamed from: ۨۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4751(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((HashSet) obj).size();
        }
        return 0;
    }

    /* renamed from: ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String[] m4752(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۦ۠۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m4753(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((C0340u) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۨۤۡ, reason: not valid java name and contains not printable characters */
    public static TextPaint m4754(Object obj) {
        if (C0063.m9589() < 0) {
            return ((TextView) obj).getPaint();
        }
        return null;
    }

    /* renamed from: ۨۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m4755(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            ((LocationListener) obj).onLocationChanged((Location) obj2);
        }
    }

    /* renamed from: ۦۨۤ۠, reason: contains not printable characters */
    public static String m4740(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}