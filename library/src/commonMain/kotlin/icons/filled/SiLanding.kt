package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLanding: ImageVector
    get() {
        if (_SiLanding != null) {
            return _SiLanding!!
        }
        _SiLanding = ImageVector.Builder(
            name = "Filled.SiLanding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.488f, 4.316f)
                lineToRelative(1.27f, 0.22f)
                quadToRelative(0.015f, 0.001f, 0.03f, 0.005f)
                curveToRelative(0.451f, 0.107f, 0.844f, 0.3f, 1.192f, 0.597f)
                lineToRelative(0.146f, 0.133f)
                lineToRelative(0.016f, 0.016f)
                lineToRelative(4.666f, 4.979f)
                lineToRelative(4.08f, 0.615f)
                quadToRelative(0.007f, 0.001f, 0.017f, 0.004f)
                curveToRelative(1.37f, 0.257f, 2.303f, 1.555f, 2.065f, 2.888f)
                lineToRelative(-0.315f, 1.967f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.578f, 0.413f)
                lineToRelative(-11.814f, -2.03f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, -0.052f)
                lineToRelative(-5.577f, -2.958f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.238f, -0.275f)
                lineTo(1.954f, 7.042f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.564f, -0.658f)
                lineToRelative(0.959f, 0.18f)
                lineToRelative(0.006f, 0.001f)
                curveToRelative(0.59f, 0.118f, 1.17f, 0.465f, 1.554f, 1.003f)
                lineToRelative(0.82f, 0.916f)
                lineToRelative(4.28f, 0.705f)
                lineTo(7.96f, 5.042f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.528f, -0.726f)
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
            }
        }.build()

        return _SiLanding!!
    }

@Suppress("ObjectPropertyName")
private var _SiLanding: ImageVector? = null
