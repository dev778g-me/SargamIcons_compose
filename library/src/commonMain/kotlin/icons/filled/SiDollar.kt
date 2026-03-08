package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDollar: ImageVector
    get() {
        if (_SiDollar != null) {
            return _SiDollar!!
        }
        _SiDollar = ImageVector.Builder(
            name = "Filled.SiDollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                verticalLineToRelative(-1.019f)
                arcToRelative(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.392f, -1.077f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -1.703f)
                curveToRelative(0.712f, 0.439f, 1.52f, 0.702f, 2.342f, 0.776f)
                verticalLineToRelative(-6.292f)
                curveToRelative(-1.172f, -0.477f, -2.09f, -1.006f, -2.749f, -1.68f)
                curveToRelative(-0.82f, -0.837f, -1.166f, -1.814f, -1.24f, -2.933f)
                curveToRelative(-0.104f, -1.561f, 0.573f, -2.813f, 1.557f, -3.665f)
                arcTo(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3.177f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1.018f)
                arcToRelative(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.392f, 1.078f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.05f, 1.703f)
                arcTo(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.02f)
                verticalLineToRelative(6.295f)
                curveToRelative(1.17f, 0.478f, 2.086f, 1.005f, 2.746f, 1.677f)
                curveToRelative(0.822f, 0.837f, 1.169f, 1.815f, 1.243f, 2.935f)
                curveToRelative(0.104f, 1.561f, -0.573f, 2.813f, -1.557f, 3.665f)
                curveToRelative(-0.7f, 0.605f, -1.557f, 1.015f, -2.432f, 1.23f)
                verticalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveToRelative(2f, -3.269f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.123f, -0.65f)
                curveToRelative(0.582f, -0.503f, 0.928f, -1.173f, 0.871f, -2.02f)
                curveToRelative(-0.05f, -0.747f, -0.254f, -1.238f, -0.675f, -1.666f)
                curveToRelative(-0.288f, -0.294f, -0.707f, -0.587f, -1.319f, -0.89f)
                close()
                moveTo(11f, 5.268f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.123f, 0.65f)
                curveToRelative(-0.582f, 0.504f, -0.928f, 1.174f, -0.871f, 2.021f)
                curveToRelative(0.05f, 0.748f, 0.253f, 1.24f, 0.673f, 1.667f)
                curveToRelative(0.288f, 0.295f, 0.707f, 0.588f, 1.321f, 0.891f)
                close()
            }
        }.build()

        return _SiDollar!!
    }

@Suppress("ObjectPropertyName")
private var _SiDollar: ImageVector? = null
