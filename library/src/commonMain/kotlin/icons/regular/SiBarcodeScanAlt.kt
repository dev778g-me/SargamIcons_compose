package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBarcodeScanAlt: ImageVector
    get() {
        if (_SiBarcodeScanAlt != null) {
            return _SiBarcodeScanAlt!!
        }
        _SiBarcodeScanAlt = ImageVector.Builder(
            name = "Regular.SiBarcodeScanAlt",
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
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(5f, 23f)
                    horizontalLineTo(3.4f)
                    arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 20.6f)
                    verticalLineTo(19f)
                    moveToRelative(18f, 4f)
                    horizontalLineToRelative(1.6f)
                    arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                    verticalLineTo(19f)
                    moveToRelative(0f, -14f)
                    verticalLineTo(3.4f)
                    arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.6f, 1f)
                    horizontalLineTo(19f)
                    moveTo(5f, 1f)
                    horizontalLineTo(3.4f)
                    arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.4f)
                    verticalLineTo(5f)
                    moveToRelative(4.6f, -1f)
                    horizontalLineToRelative(2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.6f)
                    verticalLineToRelative(2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 10f)
                    horizontalLineTo(5.6f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8.4f)
                    verticalLineTo(5.6f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 4f)
                    moveToRelative(0f, 10f)
                    horizontalLineToRelative(2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                    verticalLineToRelative(2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 20f)
                    horizontalLineTo(5.6f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18.4f)
                    verticalLineToRelative(-2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 14f)
                    moveToRelative(10f, -10f)
                    horizontalLineToRelative(2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.6f)
                    verticalLineToRelative(2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                    horizontalLineToRelative(-2.8f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8.4f)
                    verticalLineTo(5.6f)
                    arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.6f, 4f)
                    moveToRelative(0f, 10f)
                    horizontalLineToRelative(2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                    verticalLineToRelative(2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                    horizontalLineToRelative(-2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -1.6f)
                    verticalLineToRelative(-2.8f)
                    arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -1.6f)
                }
            }
        }.build()

        return _SiBarcodeScanAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiBarcodeScanAlt: ImageVector? = null
