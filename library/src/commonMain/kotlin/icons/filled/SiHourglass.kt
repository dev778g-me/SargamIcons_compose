package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHourglass: ImageVector
    get() {
        if (_SiHourglass != null) {
            return _SiHourglass!!
        }
        _SiHourglass = ImageVector.Builder(
            name = "Filled.SiHourglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.734f)
                curveToRelative(0f, 1.825f, -0.814f, 3.56f, -2.254f, 4.667f)
                lineToRelative(-0.003f, 0.003f)
                lineTo(13.65f, 12f)
                lineToRelative(2.094f, 1.596f)
                lineToRelative(0.003f, 0.003f)
                curveToRelative(1.317f, 1.012f, 2.107f, 2.549f, 2.234f, 4.2f)
                quadToRelative(0.03f, 0.143f, 0.015f, 0.296f)
                quadToRelative(0.004f, 0.085f, 0.005f, 0.17f)
                lineTo(18.001f, 21f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(5f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.734f)
                quadToRelative(0.001f, -0.086f, 0.005f, -0.171f)
                quadToRelative(-0.014f, -0.152f, 0.016f, -0.296f)
                curveToRelative(0.126f, -1.651f, 0.916f, -3.188f, 2.233f, -4.2f)
                lineToRelative(0.003f, -0.003f)
                lineTo(10.35f, 12f)
                lineToRelative(-2.093f, -1.596f)
                lineToRelative(-0.003f, -0.003f)
                curveTo(6.814f, 9.294f, 6f, 7.56f, 6f, 5.734f)
                lineTo(6f, 3f)
                lineTo(5f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(12.196f, 16.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.392f, 0f)
                lineToRelative(-5f, 1f)
                lineToRelative(0.392f, 1.96f)
                lineTo(12f, 18.02f)
                lineToRelative(4.804f, 0.96f)
                lineToRelative(0.392f, -1.96f)
                close()
            }
        }.build()

        return _SiHourglass!!
    }

@Suppress("ObjectPropertyName")
private var _SiHourglass: ImageVector? = null
