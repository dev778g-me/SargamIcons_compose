package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAirplane: ImageVector
    get() {
        if (_SiAirplane != null) {
            return _SiAirplane!!
        }
        _SiAirplane = ImageVector.Builder(
            name = "Filled.SiAirplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.989f, 1.5f)
                curveToRelative(0.432f, 0f, 0.822f, 0.137f, 1.142f, 0.43f)
                curveToRelative(0.307f, 0.28f, 0.517f, 0.675f, 0.666f, 1.133f)
                curveToRelative(0.294f, 0.908f, 0.4f, 2.24f, 0.4f, 3.98f)
                verticalLineToRelative(1.42f)
                lineToRelative(6.007f, 3.81f)
                lineToRelative(0.023f, 0.016f)
                curveToRelative(0.604f, 0.433f, 0.778f, 1.119f, 0.76f, 1.711f)
                lineToRelative(0.001f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.686f, 0.464f)
                lineToRelative(-6.406f, -2.57f)
                lineToRelative(-0.274f, 4.303f)
                lineToRelative(2.104f, 1.195f)
                lineToRelative(0.016f, 0.008f)
                curveToRelative(0.383f, 0.236f, 0.577f, 0.673f, 0.577f, 1.079f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 0.1f)
                lineToRelative(-0.313f, 1.522f)
                arcToRelative(0.502f, 0.502f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.648f, 0.374f)
                lineToRelative(-3.36f, -1.123f)
                lineToRelative(-3.347f, 1.123f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.648f, -0.374f)
                lineToRelative(-0.313f, -1.522f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -0.1f)
                curveToRelative(0f, -0.406f, 0.194f, -0.843f, 0.578f, -1.079f)
                lineToRelative(0.014f, -0.008f)
                lineToRelative(2.105f, -1.195f)
                lineToRelative(-0.275f, -4.302f)
                lineToRelative(-6.405f, 2.569f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.002f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.018f, -0.592f, 0.156f, -1.278f, 0.76f, -1.71f)
                lineToRelative(0.023f, -0.017f)
                lineToRelative(6.007f, -3.81f)
                verticalLineTo(7.044f)
                curveToRelative(0f, -1.741f, 0.104f, -3.072f, 0.395f, -3.98f)
                curveToRelative(0.147f, -0.458f, 0.355f, -0.852f, 0.661f, -1.133f)
                curveToRelative(0.32f, -0.294f, 0.71f, -0.43f, 1.141f, -0.431f)
            }
        }.build()

        return _SiAirplane!!
    }

@Suppress("ObjectPropertyName")
private var _SiAirplane: ImageVector? = null
