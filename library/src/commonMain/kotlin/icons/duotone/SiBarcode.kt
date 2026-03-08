package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiBarcode: ImageVector
    get() {
        if (_SiBarcode != null) {
            return _SiBarcode!!
        }
        _SiBarcode = ImageVector.Builder(
            name = "Duotone.SiBarcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 22f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.6f)
                verticalLineTo(18f)
                moveToRelative(16f, 4f)
                horizontalLineToRelative(1.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(18f)
                moveToRelative(0f, -12f)
                verticalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.6f, 2f)
                horizontalLineTo(18f)
                moveTo(6f, 2f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.4f)
                verticalLineTo(6f)
                moveToRelative(16f, 3f)
                verticalLineToRelative(6f)
                moveToRelative(-4f, -6f)
                verticalLineToRelative(6f)
                moveToRelative(-4f, -6f)
                verticalLineToRelative(6f)
                moveTo(6f, 9f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _SiBarcode!!
    }

@Suppress("ObjectPropertyName")
private var _SiBarcode: ImageVector? = null
