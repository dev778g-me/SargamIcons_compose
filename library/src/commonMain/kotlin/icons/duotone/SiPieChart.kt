package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPieChart: ImageVector
    get() {
        if (_SiPieChart != null) {
            return _SiPieChart!!
        }
        _SiPieChart = ImageVector.Builder(
            name = "Duotone.SiPieChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
                moveTo(16.971f, 3.568f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(0.53f, 0.53f)
                close()
                moveTo(11.47f, 6.948f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(-0.53f, -0.53f)
                close()
                moveTo(21.536f, 8.178f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.061f, -1.062f)
                lineToRelative(0.53f, 0.53f)
                close()
                moveTo(16.122f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(-0.53f, -0.53f)
                close()
                moveTo(22f, 12f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0f, -5.937f, -4.813f, -10.75f, -10.75f, -10.75f)
                verticalLineToRelative(1.5f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 12f)
                close()
                moveTo(12f, 2f)
                verticalLineToRelative(-0.75f)
                curveTo(6.063f, 1.25f, 1.25f, 6.063f, 1.25f, 12f)
                horizontalLineToRelative(1.5f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.75f)
                close()
                moveTo(2f, 12f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(0f, 5.937f, 4.813f, 10.75f, 10.75f, 10.75f)
                verticalLineToRelative(-1.5f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 12f)
                close()
                moveTo(12f, 22f)
                verticalLineToRelative(0.75f)
                curveToRelative(5.937f, 0f, 10.75f, -4.813f, 10.75f, -10.75f)
                horizontalLineToRelative(-1.5f)
                arcTo(9.25f, 9.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.25f)
                close()
                moveTo(4.929f, 19.071f)
                lineTo(5.459f, 19.601f)
                lineTo(19.601f, 5.46f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(-0.53f, -0.53f)
                lineTo(4.399f, 18.54f)
                close()
                moveTo(12f, 12f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.5f)
                lineTo(12f, 11.25f)
                close()
                moveTo(12f, 12f)
                horizontalLineToRelative(0.75f)
                lineTo(12.75f, 2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(10f)
                close()
                moveTo(16.44f, 3.038f)
                lineTo(15.91f, 2.508f)
                lineTo(11.47f, 6.948f)
                lineTo(12f, 7.478f)
                lineTo(12.53f, 8.008f)
                lineTo(16.971f, 3.568f)
                close()
                moveTo(21.005f, 7.647f)
                lineTo(20.475f, 7.117f)
                lineTo(16.122f, 11.47f)
                lineTo(16.652f, 12f)
                lineTo(17.182f, 12.53f)
                lineTo(21.536f, 8.177f)
                close()
            }
        }.build()

        return _SiPieChart!!
    }

@Suppress("ObjectPropertyName")
private var _SiPieChart: ImageVector? = null
