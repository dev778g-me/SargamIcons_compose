package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLightMode: ImageVector
    get() {
        if (_SiLightMode != null) {
            return _SiLightMode!!
        }
        _SiLightMode = ImageVector.Builder(
            name = "Duotone.SiLightMode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color.Black),
                    fillAlpha = 0.16f
                ) {
                    moveTo(12f, 16f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                }
                path(
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(5f, 12f)
                    horizontalLineTo(1f)
                    moveToRelative(22f, 0f)
                    horizontalLineToRelative(-4f)
                    moveTo(7.05f, 7.05f)
                    lineTo(4.222f, 4.222f)
                    moveToRelative(15.556f, 15.556f)
                    lineTo(16.95f, 16.95f)
                    moveToRelative(-9.9f, 0f)
                    lineToRelative(-2.828f, 2.828f)
                    moveTo(19.778f, 4.222f)
                    lineTo(16.95f, 7.05f)
                    moveTo(12f, 19f)
                    verticalLineToRelative(4f)
                    moveToRelative(0f, -22f)
                    verticalLineToRelative(4f)
                    moveToRelative(4f, 7f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                    close()
                }
            }
        }.build()

        return _SiLightMode!!
    }

@Suppress("ObjectPropertyName")
private var _SiLightMode: ImageVector? = null
