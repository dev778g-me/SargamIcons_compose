package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSpinner: ImageVector
    get() {
        if (_SiSpinner != null) {
            return _SiSpinner!!
        }
        _SiSpinner = ImageVector.Builder(
            name = "Regular.SiSpinner",
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
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 12f)
                verticalLineToRelative(4f)
                moveToRelative(-9.995f, -9.995f)
                horizontalLineToRelative(4f)
                moveToRelative(12f, 0f)
                horizontalLineToRelative(4f)
                moveTo(4.931f, 4.932f)
                lineToRelative(2.828f, 2.829f)
                moveToRelative(8.485f, 8.485f)
                lineToRelative(2.829f, 2.829f)
                moveToRelative(-14.136f, 0f)
                lineToRelative(2.829f, -2.829f)
                moveToRelative(8.485f, -8.485f)
                lineToRelative(2.829f, -2.829f)
            }
        }.build()

        return _SiSpinner!!
    }

@Suppress("ObjectPropertyName")
private var _SiSpinner: ImageVector? = null
