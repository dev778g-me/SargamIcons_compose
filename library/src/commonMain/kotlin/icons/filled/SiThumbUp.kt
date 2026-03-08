package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiThumbUp: ImageVector
    get() {
        if (_SiThumbUp != null) {
            return _SiThumbUp!!
        }
        _SiThumbUp = ImageVector.Builder(
            name = "Filled.SiThumbUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.502f, 10.375f)
                curveToRelative(-0.185f, 0.282f, -0.5f, 0.451f, -0.837f, 0.451f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineToRelative(11.148f)
                curveToRelative(0.075f, -0.038f, 0.19f, -0.107f, 0.337f, -0.217f)
                curveToRelative(0.297f, -0.22f, 0.67f, -0.561f, 1.038f, -1.01f)
                curveToRelative(0.74f, -0.902f, 1.404f, -2.17f, 1.47f, -3.686f)
                curveToRelative(0.075f, -1.807f, -0.49f, -2.53f, -0.918f, -2.85f)
                curveToRelative(-0.493f, -0.369f, -1.081f, -0.41f, -1.32f, -0.41f)
                horizontalLineTo(15.52f)
                curveToRelative(-0.748f, 0.008f, -1.516f, -0.268f, -1.932f, -0.98f)
                curveToRelative(-0.407f, -0.696f, -0.295f, -1.504f, 0.03f, -2.172f)
                lineToRelative(0.022f, -0.041f)
                lineToRelative(0.64f, -1.174f)
                lineToRelative(0.003f, -0.007f)
                lineToRelative(0.133f, -0.263f)
                curveToRelative(0.28f, -0.614f, 0.36f, -1.236f, 0.245f, -1.764f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, -1.033f)
                close()
                moveTo(7f, 8.826f)
                horizontalLineToRelative(1.125f)
                lineToRelative(4.837f, -7.375f)
                lineToRelative(0.055f, -0.075f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.222f, -0.273f)
                curveToRelative(1.326f, 0.65f, 2.116f, 1.696f, 2.377f, 2.899f)
                curveToRelative(0.254f, 1.167f, -0.01f, 2.383f, -0.58f, 3.414f)
                lineToRelative(-0.623f, 1.142f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.082f, 0.254f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.169f, 0.014f)
                horizontalLineToRelative(3.256f)
                curveToRelative(0.39f, 0f, 1.506f, 0.054f, 2.517f, 0.809f)
                curveToRelative(1.076f, 0.804f, 1.814f, 2.233f, 1.718f, 4.537f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.09f, 2.06f, -0.987f, 3.727f, -1.92f, 4.866f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.392f, 1.349f)
                curveToRelative(-0.216f, 0.16f, -0.43f, 0.297f, -0.633f, 0.4f)
                curveToRelative(-0.163f, 0.08f, -0.452f, 0.21f, -0.773f, 0.211f)
                horizontalLineTo(7f)
                verticalLineToRelative(0.2f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, 23f)
                horizontalLineTo(2.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21.2f)
                verticalLineTo(8.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.8f, 7f)
                horizontalLineToRelative(2.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8.8f)
                close()
            }
        }.build()

        return _SiThumbUp!!
    }

@Suppress("ObjectPropertyName")
private var _SiThumbUp: ImageVector? = null
